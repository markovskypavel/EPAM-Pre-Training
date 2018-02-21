package by.markovsky.taskfour.exerciseone.model;

import by.markovsky.taskfour.exception.NumberException;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class NumeralSum {

    //Counts sum of numerals of the number with recursion
    private static int countNumeralSum(int number) {
        return number > 0 ? countNumeralSum(number / 10) + number % 10 : 0;
    }
    public static int countNumeralSumRecursion(int enteredNumber) throws NumberException {
        if (enteredNumber < 0) {
            throw new NumberException("The number cannot be negative.");
        }
        return countNumeralSum(enteredNumber);
    }

    //Counts sum of numerals of the number with loop
    public static int countNumeralSumLoop(final int enteredNumber) throws NumberException {
        if (enteredNumber < 0) {
            throw new NumberException("The number cannot be negative.");
        }
        int number = enteredNumber;
        int sum = number % 10;
        while (number != 0) {
            sum += (number /= 10) % 10;
        }
        return sum;
    }

}
