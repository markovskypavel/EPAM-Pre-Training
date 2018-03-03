package by.markovsky.tasksix.data.queue;

import by.markovsky.tasksix.data.collection.CustomAbstractFixedArrayCollection;
import by.markovsky.tasksix.infrastructure.exception.CustomContainerEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomQueueOverflowException;

import java.util.Arrays;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomArrayQueue<E> extends CustomAbstractFixedArrayCollection<E> implements Queue<E> {

    public CustomArrayQueue() {
        super();
    }
    public CustomArrayQueue(int size) {
        super(size);
    }
    public CustomArrayQueue(E... element) {
        super(element);
    }
    public CustomArrayQueue(CustomArrayQueue<E> arrQueue) {
        this((E) arrQueue.fixedArray);
    }
    public CustomArrayQueue(Queue<E> queue) {
        this((E) queue.toArray());
    }

    @Override
    public boolean enqueue(E element) throws CustomQueueOverflowException {
        if (size >= containerSize) {
            throw new CustomQueueOverflowException();
        }
        for (int i = size; i > 0; i--) {
            Object temp = fixedArray[i];
            fixedArray[i] = fixedArray[i - 1];
            fixedArray[i - 1] = temp;
        }
        fixedArray[0] = element;
        ++size;
        return true;
    }

    @Override
    public E dequeue() throws CustomContainerEmptyException {
        return deleteElement();
    }

    @Override
    public String toString() {
        return "CustomArrayQueue{" +
                "fixedArray=" + Arrays.toString(fixedArray) +
                "size=" + size +
                "containerSize=" + containerSize +
                '}';
    }

}
