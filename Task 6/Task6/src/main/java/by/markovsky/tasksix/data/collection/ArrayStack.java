package by.markovsky.tasksix.data.collection;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class ArrayStack<E> extends CustomAbsractArrayCollection<E> implements Stack<E> {

    private Object[] arrayStack;

    public ArrayStack() {
        this.arrayStack = new Object[DEFAULT_SIZE];
        this.size = EMPTY_SIZE;
        this.containerSize = DEFAULT_SIZE;
    }
    public ArrayStack(E... element) {
        this.arrayStack = element.length > DEFAULT_SIZE ? new Object[this.containerSize = element.length] : new Object[this.containerSize = DEFAULT_SIZE];
        for (int i = 0; i < element.length; i++) {
            arrayStack[i] = element[i];
        }
        this.size = element.length;
    }
    public ArrayStack(ArrayStack<E> arrStack) {
        this((E)arrStack.arrayStack);
    }
    public ArrayStack(Stack<E> stack) {
        this((E)stack.toArray());
    }

    @Override
    public boolean push(E element) {
        if (size >= containerSize) {
            Object[] tempArray = arrayStack;
            arrayStack = new Object[++containerSize];
            for (int i = 0; i < tempArray.length; i++) {
                arrayStack[i] = tempArray[i];
            }
            arrayStack[size++] = element;
        } else {
            arrayStack[size++] = element;
        }
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
        this.arrayStack = new Object[DEFAULT_SIZE];
        this.size = EMPTY_SIZE;
        this.containerSize = DEFAULT_SIZE;
    }

    @Override
    public E peek() {
        return (E) arrayStack[size - 1];
    }

    @Override
    public Object[] toArray() {
        return arrayStack;
    }

    //TODO: Check iterator
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
        ArrayStack<?> that = (ArrayStack<?>) o;
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
        return "ArrayStack{" +
                "arrayStack=" + Arrays.toString(arrayStack) +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
