package by.markovsky.tasksix.data.queue;

import by.markovsky.tasksix.data.collection.CustomCollection;
import by.markovsky.tasksix.infrastructure.exception.CustomContainerEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomQueueOverflowException;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface Queue<E> extends CustomCollection<E> {
    boolean enqueue(E element) throws CustomQueueOverflowException;
    E dequeue() throws CustomContainerEmptyException;
}


