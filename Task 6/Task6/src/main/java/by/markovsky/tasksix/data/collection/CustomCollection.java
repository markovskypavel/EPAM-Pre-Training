package by.markovsky.tasksix.data.collection;

import java.util.Iterator;

public interface CustomCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean isFull();
    void clear();
    E peek();
    Object[] toArray();
    Iterator<E> iterator();
}
