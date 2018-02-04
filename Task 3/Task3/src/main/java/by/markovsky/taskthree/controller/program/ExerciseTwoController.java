package by.markovsky.taskthree.controller.program;

import by.markovsky.taskthree.view.View;

import static by.markovsky.taskthree.model.algorithm.LoopAlgorithm.*;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class ExerciseTwoController {

    public static void main(String[] args) {
        int testNumber1 = 12_556_332;
        int testNumber2 = 4004;
        int testNumber3 = 23;
        int testNumber4 = 24;
        int testNumber51 = 15;
        int testNumber52 = 25;
        int testNumber6 = 1_223_665;
        View.print("The biggest numeral of number " + testNumber1 + ": " + findBiggestNumeral(testNumber1));
        View.print("Is " + testNumber2 + " palindrome? " + (isPalindrome(testNumber2) ? "Yes" : "No"));
        View.print("Is " + testNumber3 + " simple? " + (isSimple(testNumber3) ? "Yes" : "No"));
        View.print("Simple dividers of " + testNumber4 + ": " + findAllSimpleDividers(testNumber4));
        View.print("The biggest divider of " + testNumber51 + " and " + testNumber52
                + ": " + findBiggestDivider(testNumber51, testNumber52)
                + "\nThe smallest multiple of: " + testNumber51 + " and " + testNumber52
                + ": " + findSmallestMultiple(testNumber51, testNumber52));
        View.print("The quantity of different numerals of " + testNumber6 + ": " + countDifferentNumerals(testNumber6));
    }

}
