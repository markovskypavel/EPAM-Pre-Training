package by.markovsky.taskfour.exerciseone.controller;

import by.markovsky.taskfour.exerciseone.model.NumberSum;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class NumberSumController {

    public static void main(String[] args) {
        int number = 12345; //Stub
        View.print("Number: " + number + "\nSum of numerals: " + NumberSum.countNumeralSum(number));
    }

}
