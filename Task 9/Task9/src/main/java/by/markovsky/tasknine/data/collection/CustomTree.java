package by.markovsky.tasknine.data.collection;

import by.markovsky.tasknine.infrastructure.exception.CustomTreeEmptyException;

/**
 * Created by Pavel Markovsky on 01.03.2018.
 */
public interface CustomTree<E> extends CustomCollection<E> {
    void add(E element);
    boolean contains(E element);
    void remove(E element) throws CustomTreeEmptyException;
    StringBuilder preOrder() throws CustomTreeEmptyException;
    StringBuilder postOrder() throws CustomTreeEmptyException;
    StringBuilder inOrder() throws CustomTreeEmptyException;
}
