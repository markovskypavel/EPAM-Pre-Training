package by.markovsky.tasksix.data.collection;

import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 24.02.2018.
 */
public class CustomLinkedList<E> extends CustomAbstractList<E> implements CustomList<E> {

    class Node{

    }

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean addSeveral(E[] element) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String allIndexOf(Object o) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }

}
