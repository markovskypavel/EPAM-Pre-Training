package by.markovsky.tasksix.data.stack;

import by.markovsky.tasksix.data.collection.CustomAbstractFixedArrayCollection;
import by.markovsky.tasksix.infrastructure.exception.CustomContainerEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

import java.util.Arrays;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomArrayStack<E> extends CustomAbstractFixedArrayCollection<E> implements Stack<E> {

    public CustomArrayStack() {
        super();
    }
    public CustomArrayStack(int size) {
        super(size);
    }
    public CustomArrayStack(E... element) {
        super(element);
    }
    public CustomArrayStack(CustomArrayStack<E> arrStack) {
        this((E)arrStack.fixedArray);
    }
    public CustomArrayStack(Stack<E> stack) {
        this((E)stack.toArray());
    }

    @Override
    public boolean push(E element) throws CustomStackOverflowException {
        if (size >= containerSize) {
            throw new CustomStackOverflowException();
        }
        fixedArray[size++] = element;
        return true;
    }

    @Override
    public E pop() throws CustomContainerEmptyException {
        return deleteElement();
    }

    @Override
    public String toString() {
        return "CustomArrayStack{" +
                "fixedArray=" + Arrays.toString(fixedArray) +
                "size=" + size +
                "containerSize=" + containerSize +
                '}';
    }

}
