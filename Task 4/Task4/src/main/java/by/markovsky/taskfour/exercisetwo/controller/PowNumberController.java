package by.markovsky.taskfour.exercisetwo.controller;

import by.markovsky.taskfour.exception.NumberException;
import by.markovsky.taskfour.exercisetwo.model.PowNumber;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class PowNumberController {

    public static void main(String[] args) {
        double number = 4.;
        int degree = -2;
        try {
            View.print(number + "^(" + degree + ") = " + PowNumber.powNumberRecursion(number, degree) + " (recursion)\n"
                    + number + "^(" + degree + ") = " + PowNumber.powNumberLoop(number, degree) + " (loop)");
        } catch (NumberException ne) {
            View.printError(ne.getMessage());
        }
    }

}
