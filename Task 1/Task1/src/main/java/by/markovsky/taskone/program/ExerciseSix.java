package by.markovsky.taskone.program;

import by.markovsky.taskone.algorithm.BasicAlgorithm;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class ExerciseSix {

    public static void main(String[] args) {
        int N = 123456;
        System.out.println("Number: " + N
                + "\nAverage arithmetic of numerals of number: " + BasicAlgorithm.avgArithmetic(N)
                + "\nAverage geometric of numerals of number: " + BasicAlgorithm.avgGeometric(N));
    }

}
