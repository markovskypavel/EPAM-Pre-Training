package by.markovsky.taskone.program;

import by.markovsky.taskone.algorithm.BasicAlgorithm;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class ExerciseFive {

    public static void main(String[] args) {
        int N = 12345;
        System.out.println("Number: " + N
                + "\nSum of numerals of number: " + BasicAlgorithm.countSum(N)
                + "\nMultiplication of numerals of number: " + BasicAlgorithm.countMp(N));
    }

}
