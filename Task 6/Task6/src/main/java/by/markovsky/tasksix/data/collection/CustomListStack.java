package by.markovsky.tasksix.data.collection;

import by.markovsky.tasksix.infrastructure.exception.CustomStackEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CustomListStack<E> extends CustomAbstractFixedCollection<E> implements Stack<E>  {

    private CustomList<E> linkedList;

    public CustomListStack() {
        this.linkedList = new CustomLinkedList<>();
        this.containerSize = DEFAULT_SIZE;
        this.size = EMPTY_SIZE;
    }
    public CustomListStack(int size) {
        this.linkedList = new CustomLinkedList<>();
        this.containerSize = size;
        this.size = EMPTY_SIZE;
    }
    public CustomListStack(E... element) {
        this.linkedList = new CustomLinkedList<>(element);
        this.containerSize = element.length > DEFAULT_SIZE ? element.length : DEFAULT_SIZE;
        this.size = element.length;
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
    public E pop() throws CustomStackEmptyException {
        if(isEmpty()){
            throw new CustomStackEmptyException();
        }
        return linkedList.remove(--size);
    }

    @Override
    public void clear() {
        linkedList.clear();
        size = EMPTY_SIZE;
    }

    @Override
    public E peek() {
        return isEmpty() ? null : linkedList.peek();
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

        CustomListStack<?> that = (CustomListStack<?>) o;

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
        return "CustomListStack{" +
                "linkedList=" + linkedList +
                ", size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
