package by.markovsky.taskseven.data.collection;

/**
 * Created by Pavel Markovsky on 01.03.2018.
 */
public interface CustomTree<E> extends CustomCollection<E> {
    void add(E element);
    boolean contains(E element);
    boolean remove(E element);
    StringBuilder preOrder();
    StringBuilder postOrder();
    StringBuilder inOrder();
}
