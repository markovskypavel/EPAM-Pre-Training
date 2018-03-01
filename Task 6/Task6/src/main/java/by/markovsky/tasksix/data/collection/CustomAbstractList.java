package by.markovsky.tasksix.data.collection;

/**
 * Created by Pavel Markovsky on 24.02.2018.
 */
public abstract class CustomAbstractList<E> extends CustomAbstractCollection<E> implements CustomList<E> {

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
