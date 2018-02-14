package by.markovsky.taskfour.exercisetwo.model;

/**
 * Created by Pavel Markovsky on 13.02.2018.
 */
public class PowNumber {

    public static int powNumber(int number, int degree) {
        return degree > 0 ? number * powNumber(number, degree - 1) : 1;
    }

}
