package by.markovsky.taskfour.exercisetwo.controller;

import by.markovsky.taskfour.exercisetwo.model.PowNumber;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class PowNumberController {

    public static void main(String[] args) {
        int number = 12;
        int degree = 2;
        View.print(number + "^" + degree + "=" + PowNumber.powNumber(number, degree));
    }

}
