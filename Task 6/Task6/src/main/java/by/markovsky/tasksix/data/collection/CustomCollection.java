package by.markovsky.tasksix.data.collection;

import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface CustomCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean isFull();
    void clear();
    E peek();
    Object[] toArray();
    Iterator<E> iterator();
}


