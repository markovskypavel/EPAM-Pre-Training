package by.markovsky.taskfive.data.container;

import java.util.*;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class CustomArrayList<E> implements List<E> {

    private static final int STOCK_SIZE = 0;
    private static final int EMPTY_SIZE = 0;

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
    public CustomArrayList(CustomArrayList<E> customArrayList) {
        this((E)customArrayList.arrayList);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == EMPTY_SIZE;
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
        if (index >= size || index < EMPTY_SIZE) return null;

        Object[] tempArray = arrayList;
        E tempObject = null;
        arrayList = new Object[--size];
        for (int i = 0, j = 0; i < tempArray.length; i++) {
            if (i != index) {
                arrayList[j++] = tempArray[i];
            } else {
                tempObject = (E) tempArray[i];
            }
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
        if (index >= size || index < EMPTY_SIZE) return null;

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
    public E set(int index, E element) {
        if (index < EMPTY_SIZE || index >= size) return null;

        E tempObj = null;
        for (int i = 0; i < arrayList.length; i++) {
            if (i == index) {
                tempObj = (E) arrayList[i];
                arrayList[i] = element;
                break;
            }
        }
        return tempObj;
    }

    @Override
    public void add(int index, E element) {
        if(index < EMPTY_SIZE || index > size) index = size;

        Object[] tempArray = arrayList;
        arrayList = new Object[++size];
        for (int i = 0, j = 0; i < arrayList.length; i++) {
            if (i != index) {
                arrayList[i]=tempArray[j++];
            }else{
                arrayList[i] = element;
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
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < arrayList.length; i++) {
            if(o.equals(arrayList[i])) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public String allIndexOf(Object o) {
        String index = "";
        for (int i = 0; i < arrayList.length; i++) {
            if (o.equals(arrayList[i])) {
                index += i + " ";
            }
        }
        return index;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Object[] toArray() {
        return arrayList;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < arrayList.length && arrayList[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) arrayList[currentIndex++];
            }

            //Delete element on current index position
            @Override
            public void remove() {
                if (arrayList[currentIndex] == null) return;

                Object[] tempArray = arrayList;
                arrayList = new Object[--size];
                for (int i = 0, j = 0; i < tempArray.length; i++) {
                    if (i != currentIndex) {
                        arrayList[j++] = tempArray[i];
                    }
                }
            }

            public int getCurrentIndex(){
                return currentIndex;
            }
        };
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arrayList=" + Arrays.toString(arrayList) +
                ",\nsize=" + size +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayList<?> that = (CustomArrayList<?>) o;

        if (size != that.size) return false;
        return Arrays.equals(arrayList, that.arrayList);
    }
    @Override
    public int hashCode() {
        int result = Arrays.hashCode(arrayList);
        result = 31 * result + size;
        return result;
    }



    /**
     THESE OVERRIDED METHODS ARE NOT DESCRIBED!!!
     */
    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }
    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

}
