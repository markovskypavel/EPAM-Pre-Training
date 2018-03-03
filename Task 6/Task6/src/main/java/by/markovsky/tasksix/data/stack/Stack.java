package by.markovsky.tasksix.data.stack;

import by.markovsky.tasksix.data.collection.CustomCollection;
import by.markovsky.tasksix.infrastructure.exception.CustomContainerEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface Stack<E> extends CustomCollection<E> {
    boolean push(E element) throws CustomStackOverflowException;
    E pop() throws CustomContainerEmptyException;
}

