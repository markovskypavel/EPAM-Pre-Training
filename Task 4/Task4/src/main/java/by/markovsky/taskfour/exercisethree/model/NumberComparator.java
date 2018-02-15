package by.markovsky.taskfour.exercisethree.model;

import by.markovsky.taskfour.exception.NumberException;
import by.markovsky.taskfour.exerciseone.model.NumeralSum;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class NumberComparator {

    //Compare if the sum of numerals of number1 equals to number2 with recursion algorithm
    public static boolean equalsRecursion(int enteredNumber1, int enteredNumber2) throws NumberException {
        if (enteredNumber2 < 0) {
            throw new NumberException("The number cannot be negative.");
        }
        return NumeralSum.countNumeralSumRecursion(enteredNumber1) == enteredNumber2;
    }

    //Compare if the sum of numerals of number1 equals to number2 with loop algorithm
    public static boolean equalsLoop(int enteredNumber1, int enteredNumber2) throws NumberException {
        if (enteredNumber2 < 0) {
            throw new NumberException("The number cannot be negative.");
        }
        return NumeralSum.countNumeralSumLoop(enteredNumber1) == enteredNumber2;
    }

}
