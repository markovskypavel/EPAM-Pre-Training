package by.markovsky.tasktwo.program;

import by.markovsky.tasktwo.algorithm.BasicAlgorithm;

import java.io.IOException;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseOne {

    public static void main(String[] args) {
        int N = 512;
        try {
            if (N > 0) {
                System.out.println("-Dragon, how old are you?" + "\n-I am " + N + " years old, " + BasicAlgorithm.countDragon(N));
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            System.err.println("Age cannot be less than 1 y/o");
        }
    }

}
