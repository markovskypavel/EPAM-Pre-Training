package by.markovsky.tasksix.data.collection;

public interface Stack<E> extends CustomCollection<E> {
    boolean push(E element);
    E pop();
}
