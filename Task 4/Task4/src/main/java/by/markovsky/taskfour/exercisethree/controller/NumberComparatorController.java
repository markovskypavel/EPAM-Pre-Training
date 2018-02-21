package by.markovsky.taskfour.exercisethree.controller;

import by.markovsky.taskfour.exception.NumberException;
import by.markovsky.taskfour.exercisethree.model.NumberComparator;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class NumberComparatorController {

    public static void main(String[] args) {
        int number1 = 1234567;
        int number2 = 28;
        try {
            View.print("equalsRecursion(" + number1 + "," + number2 + ") = " + NumberComparator.isEqualRecursion(number1, number2)
                    + "\nequalsLoop(" + number1 + "," + number2 + ") = " + NumberComparator.isEqualLoop(number1, number2));
        } catch (NumberException ne) {
            View.printError(ne.getMessage());
        }
    }

}
