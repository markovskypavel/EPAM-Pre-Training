package by.markovsky.tasksix.data.stack;

import by.markovsky.tasksix.data.collection.CustomAbstractFixedListCollection;
import by.markovsky.tasksix.infrastructure.exception.CustomContainerEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomListStack<E> extends CustomAbstractFixedListCollection<E> implements Stack<E>  {

    public CustomListStack() {
        super();
    }
    public CustomListStack(int size) {
        super(size);
    }
    public CustomListStack(E... element) {
        super(element);
    }
    public CustomListStack(CustomListStack<E> listStack) {
        this((E)listStack.toArray());
    }
    public CustomListStack(Stack<E> stack) {
        this((E)stack.toArray());
    }

    @Override
    public boolean push(E element) throws CustomStackOverflowException {
        if (size >= containerSize) {
            throw new CustomStackOverflowException();
        }
        linkedList.add(element);
        ++size;
        return true;
    }

    @Override
    public E pop() throws CustomContainerEmptyException {
        return deleteElement();
    }

    @Override
    public String toString() {
        return "CustomListStack{" +
                "linkedList=" + linkedList +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
