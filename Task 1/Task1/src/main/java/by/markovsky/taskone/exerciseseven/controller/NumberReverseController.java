package by.markovsky.taskone.exerciseseven.controller;

import by.markovsky.taskone.exerciseseven.model.NumberReverse;
import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class NumberReverseController {

    public static void main(String[] args) {
        int N = 1234567;
        View.print("Number: " + N
                + "\nReversed number: " + NumberReverse.reverse(N));
    }

}
