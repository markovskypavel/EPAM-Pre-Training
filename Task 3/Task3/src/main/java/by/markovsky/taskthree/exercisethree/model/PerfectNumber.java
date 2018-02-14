package by.markovsky.taskthree.exercisethree.model;

import by.markovsky.taskthree.exception.NumberException;

/**
 * Created by Pavel Markovsky on 06.02.2018.
 */
public class PerfectNumber {

    public static final int MIN_NATURAL_DIVIDER = 1;

    //Count sum of number's dividers
    public static int countDividerSum(int number) throws NumberException {
        if (number < MIN_NATURAL_DIVIDER) {
            throw new NumberException("Number cannot be less than 1.");
        }
        int dividerSum = 0;
        for (int divider = MIN_NATURAL_DIVIDER; number != divider; divider++) {
            if (number % divider == 0) {
                dividerSum += divider;
            }
        }
        return dividerSum;
    }

    //Check if the natural number is perfect or not
    public static boolean isPerfectNumber(int number) throws NumberException {
        return number == countDividerSum(number);
    }

}
