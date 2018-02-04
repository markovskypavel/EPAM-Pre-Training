package by.markovsky.taskthree.controller.program;

import by.markovsky.taskthree.model.algorithm.LoopAlgorithm;
import by.markovsky.taskthree.view.View;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class ExerciseThreeController {

    public static void main(String[] args) {
        int testNumber1 = 6; //Perfect
        int testNumber2 = 28; //Perfect
        int testNumber3 = 496; //Perfect
        int testNumber4 = 8128; //Perfect
        int testNumber5 = 123; //Not perfect
        View.print("Is " + testNumber1 + " perfect number? "
                + (LoopAlgorithm.isPerfectNumber(testNumber1) ? "Yes" : "No"));
        View.print("Is " + testNumber2 + " perfect number? "
                + (LoopAlgorithm.isPerfectNumber(testNumber2) ? "Yes" : "No"));
        View.print("Is " + testNumber3 + " perfect number? "
                + (LoopAlgorithm.isPerfectNumber(testNumber3) ? "Yes" : "No"));
        View.print("Is " + testNumber4 + " perfect number? "
                + (LoopAlgorithm.isPerfectNumber(testNumber4) ? "Yes" : "No"));
        View.print("Is " + testNumber5 + " perfect number? "
                + (LoopAlgorithm.isPerfectNumber(testNumber5) ? "Yes" : "No"));
    }

}
