package by.markovsky.tasksix.data.queue;

import by.markovsky.tasksix.data.collection.CustomAbstractFixedListCollection;
import by.markovsky.tasksix.infrastructure.exception.CustomContainerEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomQueueOverflowException;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomListQueue<E> extends CustomAbstractFixedListCollection<E> implements Queue<E> {

    public CustomListQueue() {
        super();
    }
    public CustomListQueue(int size) {
        super(size);
    }
    public CustomListQueue(E... element) {
        super(element);
    }
    public CustomListQueue(CustomListQueue<E> arrQueue) {
        this((E)arrQueue.toArray());
    }
    public CustomListQueue(Queue<E> queue) {
        this((E)queue.toArray());
    }

    @Override
    public boolean enqueue(E element) throws CustomQueueOverflowException {
        if (size >= containerSize) {
            throw new CustomQueueOverflowException();
        }
        linkedList.add(0, element);
        ++size;
        return true;
    }

    @Override
    public E dequeue() throws CustomContainerEmptyException {
        return deleteElement();
    }

    @Override
    public String toString() {
        return "CustomListQueue{" +
                "linkedList=" + linkedList +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
