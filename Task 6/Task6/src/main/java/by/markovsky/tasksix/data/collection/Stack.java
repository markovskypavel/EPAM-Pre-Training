package by.markovsky.tasksix.data.collection;

import by.markovsky.tasksix.infrastructure.exception.CustomStackEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface Stack<E> extends CustomCollection<E> {
    boolean push(E element) throws CustomStackOverflowException;
    E pop() throws CustomStackEmptyException;
}

