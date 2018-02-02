package by.markovsky.taskone.program;

import by.markovsky.taskone.algorithm.BasicAlgorithm;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class ExerciseTwo {

    public static void main(String[] args) {
        int R1 = 2;
        int R2 = 1;
        System.out.println("R1 = " + R1
                + "\nR2 = " + R2
                + "\nArea of a ring: " + BasicAlgorithm.findRingArea(R1, R2));
    }

}
