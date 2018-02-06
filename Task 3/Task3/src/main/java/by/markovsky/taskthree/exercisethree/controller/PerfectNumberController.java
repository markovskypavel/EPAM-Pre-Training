package by.markovsky.taskthree.exercisethree.controller;

import by.markovsky.taskthree.exercisethree.model.PerfectNumber;
import by.markovsky.taskthree.view.View;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class PerfectNumberController {

    public static void main(String[] args) {
        int testNumber1 = 6; //Perfect
        int testNumber2 = 28; //Perfect
        int testNumber3 = 496; //Perfect
        int testNumber4 = 8128; //Perfect
        int testNumber5 = 123; //Not perfect
        View.print("Is " + testNumber1 + " perfect number? "
                + (PerfectNumber.isPerfectNumber(testNumber1) ? "Yes" : "No"));
        View.print("Is " + testNumber2 + " perfect number? "
                + (PerfectNumber.isPerfectNumber(testNumber2) ? "Yes" : "No"));
        View.print("Is " + testNumber3 + " perfect number? "
                + (PerfectNumber.isPerfectNumber(testNumber3) ? "Yes" : "No"));
        View.print("Is " + testNumber4 + " perfect number? "
                + (PerfectNumber.isPerfectNumber(testNumber4) ? "Yes" : "No"));
        View.print("Is " + testNumber5 + " perfect number? "
                + (PerfectNumber.isPerfectNumber(testNumber5) ? "Yes" : "No"));
    }

}
