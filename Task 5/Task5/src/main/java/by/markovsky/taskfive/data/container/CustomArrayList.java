package by.markovsky.taskfive.data.container;

import java.util.*;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class CustomArrayList<E> implements List<E> {

    private static final int STOCK_SIZE = 0;

    private Object[] arrayList;
    private int size;

    public CustomArrayList() {
        arrayList = new Object[STOCK_SIZE];
        size = arrayList.length;
    }
    public CustomArrayList(E... element) {
        arrayList = new Object[element.length];
        for (int i = 0; i < element.length; i++) {
            arrayList[i] = element[i];
        }
        size = element.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == STOCK_SIZE;
    }

    @Override
    public boolean add(E element) {
        Object[] tempArray = arrayList;
        arrayList = new Object[++size];
        for (int i = 0; i < tempArray.length; i++) {
            arrayList[i] = tempArray[i];
        }
        arrayList[size - 1] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    public boolean addSeveral(E... element) {
        Object[] tempArray = arrayList;
        arrayList = new Object[size + element.length];
        for (int i = 0; i < tempArray.length; i++) {
            arrayList[i] = tempArray[i];
        }
        for (int i = 0; i < element.length; i++) {
            arrayList[tempArray.length + i] = element[i];
        }
        size += element.length;
        return true;
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < STOCK_SIZE) return null;

        Object[] tempArray = arrayList;
        E tempObject = null;
        arrayList = new Object[--size];
        for (int i = 0, j = 0; i < tempArray.length; i++) {
            if (i != index) {
                arrayList[j++] = tempArray[i];
            }
            tempObject = (E) tempArray[i];
        }
        return tempObject;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        } else{
            remove(index);
            return true;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arrayList[i] = null;
        }
        arrayList = new Object[STOCK_SIZE];
        size = arrayList.length;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < STOCK_SIZE) return null;

        E tempObject = null;
        for (int i = 0; i < arrayList.length; i++) {
            if (i == index) {
                tempObject = (E) arrayList[i];
                break;
            }
        }
        return tempObject;
    }

    @Override
    public void add(int index, E element) {
        if (index < STOCK_SIZE) {
            return;
        } else if (index == size) {
            add(element);
        } else if (index > size) {
            arrayList = new Object[index + 1];
            ++size;
        }
        for (int i = 0; i < arrayList.length; i++) {
            if (i == index) {
                arrayList[i] = element;
                break;
            }
        }
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arrayList.length; i++) {
            if(o.equals(arrayList[i])) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arrayList=" + Arrays.toString(arrayList) +
                ", size=" + size +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayList<?> that = (CustomArrayList<?>) o;

        if (size != that.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(arrayList, that.arrayList);
    }
    @Override
    public int hashCode() {
        int result = Arrays.hashCode(arrayList);
        result = 31 * result + size;
        return result;
    }





    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

}
