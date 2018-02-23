package by.markovsky.tasksix.data.collection;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public interface Stack<E> extends CustomCollection<E> {
    boolean push(E element);
    E pop();
}

