package by.markovsky.tasktwo.program;

import by.markovsky.tasktwo.algorithm.ConditionAlgorithm;

import java.io.IOException;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseOne {

    public static final int MIN_YEAR = 0;

    public static void main(String[] args) {
        int N = 512;
        try {
            if (N > MIN_YEAR) {
                int heads = ConditionAlgorithm.countDragonHeads(N);
                System.out.println("-Dragon, how old are you?" + "\n-I am " + N
                        + " years old and I have " + heads + " heads and "
                        + ConditionAlgorithm.countDragonEyes(heads) + " eyes.");
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("Age cannot be less than 1 y/o");
        }
    }

}
