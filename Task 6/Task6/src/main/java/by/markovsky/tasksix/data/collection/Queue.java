package by.markovsky.tasksix.data.collection;

public interface Queue<E> extends CustomCollection<E> {
    boolean enqueue(E element);
    E dequeue();
}
