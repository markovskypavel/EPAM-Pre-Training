package by.markovsky.taskfour.exercisefour.model;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class FibonacciCounter {

    public static final int FIRST_FIBONACCI_NUMBER = 0;
    public static final int SECOND_FIBONACCI_NUMBER = 1;
    public static final int WRONG_INDEX = -1;

    //Finds Fibonacci number by its index with recursion
    public static int findFibonacciNumberRecursion(int index) {
        int fibonacciNumber;
        if (index > 2) {
            fibonacciNumber = findFibonacciNumberRecursion(index - 2) + findFibonacciNumberRecursion(index - 1);
        } else if (index == 2) {
            fibonacciNumber = SECOND_FIBONACCI_NUMBER;
        } else if (index == 1) {
            fibonacciNumber = FIRST_FIBONACCI_NUMBER;
        } else {
            fibonacciNumber = WRONG_INDEX;
        }
        return fibonacciNumber;
    }

    //Finds Fibonacci number by its index with loop
    public static int findFibonacciNumberLoop(int index) {
        int fibonacciNumber = SECOND_FIBONACCI_NUMBER;
        if (index > 1) {
            int fib1 = FIRST_FIBONACCI_NUMBER;
            int fib2 = SECOND_FIBONACCI_NUMBER;
            for (int curIndex = 2; curIndex < index; curIndex++) {
                fibonacciNumber = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibonacciNumber;
            }
        } else if (index == 1) {
            fibonacciNumber = FIRST_FIBONACCI_NUMBER;
        } else {
            fibonacciNumber = WRONG_INDEX;
        }
        return fibonacciNumber;
    }

}
