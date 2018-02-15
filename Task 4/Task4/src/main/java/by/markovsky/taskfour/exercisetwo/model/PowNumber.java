package by.markovsky.taskfour.exercisetwo.model;

import by.markovsky.taskfour.exception.NumberException;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class PowNumber {

    //Pow number with recursion
    private static double powNumber(double enteredNumber, int degree) {
        double powedNumber = 1.;
        if (degree > 0) {
            powedNumber = powNumber(enteredNumber, degree - 1) * enteredNumber;
        } else if (degree < 0) {
            powedNumber = powNumber(enteredNumber, degree + 1) / enteredNumber;
        }
        return powedNumber;
    }
    public static double powNumberRecursion(double enteredNumber, int degree) throws NumberException {
        if (enteredNumber == 0) {
            throw new NumberException("The number cannot be 0.");
        }
        return powNumber(enteredNumber, degree);
    }

    //Pow number with loop
    public static double powNumberLoop(double enteredNumber, int degree) throws NumberException {
        if (enteredNumber == 0) {
            throw new NumberException("The number cannot be 0.");
        }
        double powedNumber = 1.;
        if (degree > 0) {
            for (; degree != 0; degree--) {
                powedNumber *= enteredNumber;
            }
        } else if (degree < 0) {
            for (; degree != 0; degree++) {
                powedNumber /= enteredNumber;
            }
        }
        return powedNumber;
    }

}
