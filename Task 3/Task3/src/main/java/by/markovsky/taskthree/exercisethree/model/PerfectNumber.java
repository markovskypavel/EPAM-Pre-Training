package by.markovsky.taskthree.exercisethree.model;

/**
 * Created by Pavel Markovsky on 06.02.2018.
 */
public class PerfectNumber {

    public static final int MIN_NATURAL_DIVIDER = 1;
    public static final int SUM_START = 0;

    //Count sum of number's dividers
    public static int countDividerSum(int number) {
        int dividerSum = SUM_START;
        for (int divider = MIN_NATURAL_DIVIDER; number != divider; divider++) {
            if (number % divider == 0) {
                dividerSum += divider;
            }
        }
        return dividerSum;
    }
    //Check if the natural number is perfect or not
    public static boolean isPerfectNumber(int number) {
        return number == countDividerSum(number);
    }

}
