package by.markovsky.taskfour.exercisefour.model;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class FibonacciCounter {

    public static int findFibonacciNumber(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return findFibonacciNumber(number - 2) + findFibonacciNumber(number - 1);
    }

}
