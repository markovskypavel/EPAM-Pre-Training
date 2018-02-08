package by.markovsky.taskone.exercisesix.controller;

import by.markovsky.taskone.exercisesix.model.NumberAverage;
import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class NumberAverageController {

    public static void main(String[] args) {
        int N = 123456;
        View.print("Number: " + N
                + "\nAverage arithmetic of numerals of number: " + NumberAverage.avgArithmetic(N)
                + "\nAverage geometric of numerals of number: " + NumberAverage.avgGeometric(N));
    }

}
