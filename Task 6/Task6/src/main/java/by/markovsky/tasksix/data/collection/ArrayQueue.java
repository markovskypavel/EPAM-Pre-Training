package by.markovsky.tasksix.data.collection;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue<E> extends CustomAbsractArrayCollection<E> implements Queue<E> {

    private Object[] arrayQueue;

    public ArrayQueue() {
        this.arrayQueue = new Object[DEFAULT_SIZE];
        this.size = EMPTY_SIZE;
        this.containerSize = DEFAULT_SIZE;
    }
    public ArrayQueue(E... element) {
        this.arrayQueue = element.length > DEFAULT_SIZE ? new Object[element.length] : new Object[DEFAULT_SIZE];
        this.containerSize = element.length;
        for (int i = 0; i < element.length; i++) {
            arrayQueue[i] = element[i];
        }
        this.size = element.length;
    }
    public ArrayQueue(ArrayQueue<E> arrQueue) {
        this((E)arrQueue.arrayQueue);
    }
    public ArrayQueue(Queue<E> queue) {
        this((E)queue.toArray());
    }

    @Override
    public boolean enqueue(E element) {
        Object[] tempArray = arrayQueue;
        arrayQueue = size >= containerSize ? new Object[++containerSize] : new Object[containerSize];
        arrayQueue[0] = element;
        for (int i = 0; i < tempArray.length; i++) {
            arrayQueue[i + 1] = tempArray[i];
        }
        return true;
    }

    @Override
    public E dequeue() {
        if(!isEmpty()){
            E tempObj = (E) arrayQueue[size - 1];
            arrayQueue[--size] = null;
            return tempObj;
        }
        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrayQueue.length; i++) {
            arrayQueue[i] = null;
        }
        this.arrayQueue = new Object[DEFAULT_SIZE];
        this.size = EMPTY_SIZE;
        this.containerSize = DEFAULT_SIZE;
    }

    @Override
    public E peek() {
        return (E) arrayQueue[size - 1];
    }

    @Override
    public Object[] toArray() {
        return arrayQueue;
    }

    //TODO: check iterator
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

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
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
        ArrayQueue<?> that = (ArrayQueue<?>) o;
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
        return "ArrayQueue{" +
                "arrayQueue=" + Arrays.toString(arrayQueue) +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}