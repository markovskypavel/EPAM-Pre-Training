package by.markovsky.taskfour.exercisethree.model;

import by.markovsky.taskfour.exception.NumberException;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class NumberComparator {

    //Compare if the sum of numerals of number1 equals to number2 with recursion algorithm
    private static boolean equalsRecursion(int number1, int number2) {
        return number1 > number2 ? equalsRecursion(number1 / 10, number2 - number1 % 10) : number1 == number2;
    }
    public static boolean isEqualRecursion(int enteredNumber1, int enteredNumber2) throws NumberException {
        if (enteredNumber2 < 0 || enteredNumber1 < 0) {
            throw new NumberException("The number cannot be negative.");
        }
        return equalsRecursion(enteredNumber1, enteredNumber2);
    }

    //Compare if the sum of numerals of number1 equals to number2 with loop algorithm
    public static boolean isEqualLoop(final int enteredNumber1, final int enteredNumber2) throws NumberException {
        if (enteredNumber2 < 0 || enteredNumber1 < 0) {
            throw new NumberException("The number cannot be negative.");
        }
        int number1 = enteredNumber1;
        int number2 = enteredNumber2 - enteredNumber1 % 10;
        while (number1 > number2) {
            number2 -= (number1 /= 10) % 10;
        }
        return number1 == number2;
    }

}
