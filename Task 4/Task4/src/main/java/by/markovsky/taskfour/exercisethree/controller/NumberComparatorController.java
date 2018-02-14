package by.markovsky.taskfour.exercisethree.controller;

import by.markovsky.taskfour.exercisethree.model.NumberComparator;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class NumberComparatorController {

    public static void main(String[] args) {
        int N = 12345;
        int S = 15;
        View.print("equals(" + N + "," + S + ") = " + NumberComparator.equals(N, S));
    }

}
