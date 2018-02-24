package by.markovsky.tasksix.data.collection;

import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

import java.util.*;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomArrayStack<E> extends CustomAbstractFixedCollection<E> implements Stack<E> {

    private Object[] arrayStack;

    public CustomArrayStack() {
        this.arrayStack = new Object[this.containerSize = DEFAULT_SIZE];
        this.size = EMPTY_SIZE;
    }
    public CustomArrayStack(int size) {
        this.arrayStack = new Object[this.containerSize = size];
        this.size = EMPTY_SIZE;
    }
    public CustomArrayStack(E... element) {
        this.arrayStack = element.length > DEFAULT_SIZE ? new Object[this.containerSize = element.length] : new Object[this.containerSize = DEFAULT_SIZE];
        for (int i = 0; i < element.length; i++) {
            arrayStack[i] = element[i];
        }
        this.size = element.length;
    }
    public CustomArrayStack(CustomArrayStack<E> arrStack) {
        this((E)arrStack.arrayStack);
    }
    public CustomArrayStack(Stack<E> stack) {
        this((E)stack.toArray());
    }

    @Override
    public boolean push(E element) throws CustomStackOverflowException {
        if (size >= containerSize) {
            throw new CustomStackOverflowException();
        }
        arrayStack[size++] = element;
        return true;
    }

    @Override
    public E pop() {
        if(!isEmpty()){
            E tempObj = (E) arrayStack[size - 1];
            arrayStack[--size] = null;
            return tempObj;
        }
        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrayStack.length; i++) {
            arrayStack[i] = null;
        }
        arrayStack = new Object[containerSize];
        size = EMPTY_SIZE;
    }

    @Override
    public E peek() {
        return (E) arrayStack[size - 1];
    }

    @Override
    public Object[] toArray() {
        return arrayStack;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentPos = size - 1;

            @Override
            public boolean hasNext() {
                return currentPos > -1 && arrayStack[currentPos] != null;
            }

            @Override
            public E next() {
                return (E) arrayStack[currentPos--];
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
        CustomArrayStack<?> that = (CustomArrayStack<?>) o;
        return Arrays.equals(arrayStack, that.arrayStack);
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(arrayStack);
        return result;
    }
    @Override
    public String toString() {
        return "CustomArrayStack{" +
                "arrayStack=" + Arrays.toString(arrayStack) +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
