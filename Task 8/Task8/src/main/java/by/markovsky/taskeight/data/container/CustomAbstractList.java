package by.markovsky.taskeight.data.container;

/**
 * Created by Pavel Markovsky on 21.02.2018.
 */
public abstract class CustomAbstractList<E> implements CustomList<E> {

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

}
