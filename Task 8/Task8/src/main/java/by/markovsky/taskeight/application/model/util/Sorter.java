package by.markovsky.taskeight.application.model.util;

import java.lang.reflect.Array;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class Sorter {

    private static <T extends Comparable<? super T>> void swap(T[] array, int left, int right) {
        if (left != right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }

    //Bubble sort's the worst case O(N^2)
    public static <T extends Comparable<? super T>> void bubbleSort(T[] array) {
        boolean sorted = true;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i + 1].compareTo(array[i]) < 0) {
                    swap(array, i, i + 1);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

    //Insertion sort's the worst case O(N^2)
    public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    //Selection sort's the worst case O(N^2)
    public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[indexMin]) < 0) {
                    indexMin = j;
                }
            }
            swap(array, indexMin, i);
        }
    }

    //Merge sort's the worst case O(n*log(n))
    public static <T extends Comparable<? super T>> void mergeSort(T[] array) {
        mergeSortRecursion(array, 0, array.length - 1);
    }
    private static <T extends Comparable<? super T>> void mergeSortRecursion(T[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSortRecursion(array, low, middle);
            mergeSortRecursion(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }
    private static <T extends Comparable<? super T>> void merge(T[] array, int low, int middle, int high) {
        T[] helper = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft].compareTo(helper[helperRight]) <= 0) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    //Quick sort's the worst case O(N^2)
    public static <T extends Comparable<? super T>> void quickSort(T[] array) {
        quickSortRecursion(array, 0, array.length - 1);
    }
    private static <T extends Comparable<? super T>> void quickSortRecursion(T[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i].compareTo(array[cur]) <= 0)) {
                i++;
            }
            while (j > cur && (array[cur].compareTo(array[j]) <= 0)) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        quickSortRecursion(array, start, cur);
        quickSortRecursion(array, cur + 1, end);
    }

}
