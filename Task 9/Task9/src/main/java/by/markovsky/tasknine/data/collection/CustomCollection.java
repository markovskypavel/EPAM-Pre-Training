package by.markovsky.tasknine.data.collection;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface CustomCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    void clear();
    E[] toArray();
}


