package by.markovsky.taskfour.exerciseone.controller;

import by.markovsky.taskfour.exception.NumberException;
import by.markovsky.taskfour.exerciseone.model.NumeralSum;
import by.markovsky.taskfour.exerciseone.model.NumberValidator;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class NumeralSumController {

    public static void main(String[] args) {
        int number = 12345; //Stub
        try {
            View.print("Number: " + number
                    + "\nSum of numerals with recursion: "
                    + (NumberValidator.isNatural(number) ? NumeralSum.countNumeralSumRecursion(number) : "NOT NATURAL")
                    + "\nSum of numerals with loop: "
                    + (NumberValidator.isNatural(number) ? NumeralSum.countNumeralSumLoop(number) : "NOT NATURAL"));
        } catch (NumberException ne) {
            View.printError(ne.getMessage());
        }
    }

}
