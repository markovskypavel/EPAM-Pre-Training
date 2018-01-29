package by.markovsky.taskone.program;

import by.markovsky.taskone.algorithm.BasicAlgorithm;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class ExerciseFour {

    public static void main(String[] args) {
        int N = 1234;
        System.out.println("Number: " + N
                + "\nForm of sequence (0 - none; 1 - increasing; -1 - decreasing): " + BasicAlgorithm.isSequence(N));
    }

}
