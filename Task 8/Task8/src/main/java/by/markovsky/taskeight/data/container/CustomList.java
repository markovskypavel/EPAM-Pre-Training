package by.markovsky.taskeight.data.container;

import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 20.02.2018.
 */
public interface CustomList<E> extends Iterable<E> {
    int size();
    boolean isEmpty();

    boolean add(E element);
    boolean addSeveral(E... element);
    E remove(int index);
    boolean remove(Object o);
    void clear();
    E get(int index);
    E set(int index, E element);
    void add(int index, E element);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    String allIndexOf(Object o);
    boolean contains(Object o);
    Object[] toArray();
    Iterator<E> iterator();
}
