package by.markovsky.tasksix.data.collection;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface Queue<E> extends CustomCollection<E> {
    boolean enqueue(E element);
    E dequeue();
}


