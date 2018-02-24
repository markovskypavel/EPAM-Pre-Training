package by.markovsky.tasksix.data.collection;

/**
 * Created by Pavel Markovsky on 24.02.2018.
 */
/**
 Abstract class for fixed-size containers like stack or queue.
 */
public abstract class CustomAbstractFixedCollection<E> extends CustomAbsractCollection<E> implements CustomCollection<E> {

    protected static final int DEFAULT_SIZE = 10;

    protected int containerSize;

    @Override
    public boolean isFull() {
        return size == containerSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomAbstractFixedCollection<?> that = (CustomAbstractFixedCollection<?>) o;

        return containerSize == that.containerSize;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + containerSize;
        return result;
    }
    @Override
    public String toString() {
        return "CustomAbstractFixedCollection{" +
                "containerSize=" + containerSize +
                '}';
    }

}
