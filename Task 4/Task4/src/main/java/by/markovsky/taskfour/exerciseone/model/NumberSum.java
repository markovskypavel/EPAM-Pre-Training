package by.markovsky.taskfour.exerciseone.model;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class NumberSum {

    //Counts sum of numerals of the number with recursion
    public static int countNumeralSum(int number) {
        return number > 0 ? countNumeralSum(number / 10) + number % 10 : 0;
    }

}
