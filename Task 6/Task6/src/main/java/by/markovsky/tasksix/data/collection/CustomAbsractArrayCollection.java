package by.markovsky.tasksix.data.collection;

import java.util.Objects;

public abstract class CustomAbsractArrayCollection<E> implements CustomCollection<E> {

    protected static final int EMPTY_SIZE = 0;
    protected static final int DEFAULT_SIZE = 10;

    protected int size;
    protected int containerSize;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == EMPTY_SIZE;
    }

    @Override
    public boolean isFull() {
        return size == containerSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomAbsractArrayCollection<?> that = (CustomAbsractArrayCollection<?>) o;
        return size == that.size &&
                containerSize == that.containerSize;
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, containerSize);
    }
    @Override
    public String toString() {
        return "CustomAbsractArrayCollection{" +
                "size=" + size +
                ", containerSize=" + containerSize +
                '}';
    }

}
