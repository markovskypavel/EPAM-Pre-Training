package by.markovsky.tasksix.data.collection;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public abstract class CustomAbsractCollection<E> implements CustomCollection<E> {

    protected static final int EMPTY_SIZE = 0;

    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == EMPTY_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomAbsractCollection<?> that = (CustomAbsractCollection<?>) o;

        return size == that.size;
    }
    @Override
    public int hashCode() {
        return size;
    }
    @Override
    public String toString() {
        return "CustomAbsractCollection{" +
                "size=" + size +
                '}';
    }

}
