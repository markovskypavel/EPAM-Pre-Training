package by.markovsky.tasksix.data.collection;

import by.markovsky.tasksix.infrastructure.exception.CustomQueueOverflowException;

import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomListQueue<E> extends CustomAbstractFixedCollection<E> implements Queue<E> {

    private CustomList<E> linkedList;

    public CustomListQueue() {
        this.linkedList = new CustomLinkedList<>();
        this.containerSize = DEFAULT_SIZE;
        this.size = EMPTY_SIZE;
    }
    public CustomListQueue(int size) {
        this.linkedList = new CustomLinkedList<>();
        this.containerSize = size;
        this.size = EMPTY_SIZE;
    }
    public CustomListQueue(E... element) {
        this.linkedList = new CustomLinkedList<>(element);
        this.containerSize = element.length > DEFAULT_SIZE ? element.length : DEFAULT_SIZE;
        this.size = element.length;
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
    public E dequeue() {
        return linkedList.remove(--size);
    }

    @Override
    public void clear() {
        linkedList.clear();
        size = EMPTY_SIZE;
    }

    @Override
    public E peek() {
        return linkedList.peek();
    }

    @Override
    public Object[] toArray() {
        return linkedList.toArray();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentPos = size - 1;

            @Override
            public boolean hasNext() {
                return currentPos > -1 && linkedList.get(currentPos) != null;
            }

            @Override
            public E next() {
                return linkedList.get(currentPos--);
            }

            public int getCurrentPos(){
                return currentPos;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomListQueue<?> that = (CustomListQueue<?>) o;

        return linkedList != null ? linkedList.equals(that.linkedList) : that.linkedList == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (linkedList != null ? linkedList.hashCode() : 0);
        return result;
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
