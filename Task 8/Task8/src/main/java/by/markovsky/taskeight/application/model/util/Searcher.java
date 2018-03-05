package by.markovsky.taskeight.application.model.util;

/**
 * Created by Pavel Markovsky on 04.03.2018.
 */
public class Searcher {

    //Binary search's the worst case O(N), the best O(log(n))
    public static <T extends Comparable<? super T>> int binarySearch(T[] sortedArray, T element) {
        int low = 0;
        int high = sortedArray.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid].compareTo(element) < 0) {
                low = mid + 1;
            } else if (sortedArray[mid].compareTo(element) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static <T extends Comparable<? super T>> int binarySearchRecursion(T[] sortedArray, T element, int low, int high) {
        int mid = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (sortedArray[mid].compareTo(element) == 0) {
            return mid;
        } else if (sortedArray[mid].compareTo(element) > 0) {
            return binarySearchRecursion(sortedArray, element, low, mid - 1);
        } else {
            return binarySearchRecursion(sortedArray, element, mid + 1, high);
        }
    }

    //Linear search's the worst case O(N)
    public static <T extends Comparable<? super T>> int linearSearch(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(element) == 0) {
                return i;
            }
        }
        return -1;
    }

}
