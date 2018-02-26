package by.markovsky.tasksix.data.collection;

import by.markovsky.tasksix.infrastructure.exception.CustomQueueEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomQueueOverflowException;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomArrayQueue<E> extends CustomAbstractFixedCollection<E> implements Queue<E> {

    private Object[] arrayQueue;

    public CustomArrayQueue() {
        this.arrayQueue = new Object[this.containerSize = DEFAULT_SIZE];
        this.size = EMPTY_SIZE;
    }
    public CustomArrayQueue(int size) {
        this.arrayQueue = new Object[this.containerSize = size];
        this.size = EMPTY_SIZE;
    }
    public CustomArrayQueue(E... element) {
        this.arrayQueue = element.length > DEFAULT_SIZE ? new Object[this.containerSize = element.length] : new Object[this.containerSize = DEFAULT_SIZE];
        for (int i = 0; i < element.length; i++) {
            arrayQueue[i] = element[i];
        }
        this.size = element.length;
    }
    public CustomArrayQueue(CustomArrayQueue<E> arrQueue) {
        this((E)arrQueue.arrayQueue);
    }
    public CustomArrayQueue(Queue<E> queue) {
        this((E)queue.toArray());
    }

    @Override
    public boolean enqueue(E element) throws CustomQueueOverflowException {
        if (size >= containerSize) {
            throw new CustomQueueOverflowException();
        }
        for (int i = size; i > 0; i--) {
            Object temp = arrayQueue[i];
            arrayQueue[i] = arrayQueue[i - 1];
            arrayQueue[i - 1] = temp;
        }
        arrayQueue[0] = element;
        ++size;
        return true;
    }

    @Override
    public E dequeue() throws CustomQueueEmptyException {
        if(isEmpty()){
            throw new CustomQueueEmptyException();
        }
        E tempObj = (E) arrayQueue[size - 1];
        arrayQueue[--size] = null;
        return tempObj;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrayQueue.length; i++) {
            arrayQueue[i] = null;
        }
        arrayQueue = new Object[containerSize];
        size = EMPTY_SIZE;
    }

    @Override
    public E peek() {
        return isEmpty() ? null : (E) arrayQueue[size - 1];
    }

    @Override
    public Object[] toArray() {
        return arrayQueue;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentPos = size - 1;

            @Override
            public boolean hasNext() {
                return currentPos > -1 && arrayQueue[currentPos] != null;
            }

            @Override
            public E next() {
                return (E) arrayQueue[currentPos--];
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
        CustomArrayQueue<?> that = (CustomArrayQueue<?>) o;
        return Arrays.equals(arrayQueue, that.arrayQueue);
    }
    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(arrayQueue);
        return result;
    }
    @Override
    public String toString() {
        return "CustomArrayQueue{" +
                "arrayQueue=" + Arrays.toString(arrayQueue) +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
