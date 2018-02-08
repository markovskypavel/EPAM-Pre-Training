package by.markovsky.tasktwo.exercisefive.controller;

import by.markovsky.tasktwo.exception.RangeException;
import by.markovsky.tasktwo.view.View;

import static by.markovsky.tasktwo.exercisefive.model.IntConverter.intToString;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class IntConverterController {

    public static void main(String[] args) {
        int number1 = 87;
        int number2 = 13;
        int number3 = 567;
        int number4 = 5;
        int number5 = 215;
        try {
            View.print("Your number is " + number1 + " (" + intToString(number1) + ")");
            View.print("Your number is " + number2 + " (" + intToString(number2) + ")");
            View.print("Your number is " + number3 + " (" + intToString(number3) + ")");
            View.print("Your number is " + number4 + " (" + intToString(number4) + ")");
            View.print("Your number is " + number5 + " (" + intToString(number5) + ")");
        } catch (RangeException re) {
            View.printError(re.getMessage());
        }
    }

}
