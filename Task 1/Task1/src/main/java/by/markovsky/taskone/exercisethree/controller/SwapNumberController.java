package by.markovsky.taskone.exercisethree.controller;

import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class SwapNumberController {

    public static void main(String[] args) {
        double number1 = 4d;
        double number2 = 5d;
        View.print("BEFORE=> Number 1: " + number1 + " Number 2: " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        View.print("AFTER=> Number 1: " + number1 + " Number 2: " + number2);
    }

}
