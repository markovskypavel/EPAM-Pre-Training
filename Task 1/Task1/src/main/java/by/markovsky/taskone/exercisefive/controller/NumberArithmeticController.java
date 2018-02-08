package by.markovsky.taskone.exercisefive.controller;

import by.markovsky.taskone.exercisefive.model.NumberArithmetic;
import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class NumberArithmeticController {

    public static void main(String[] args) {
        int N = 12345;
        View.print("Number: " + N
                + "\nSum of numerals of number: " + NumberArithmetic.countSum(N)
                + "\nMultiplication of numerals of number: " + NumberArithmetic.countMp(N));
    }

}
