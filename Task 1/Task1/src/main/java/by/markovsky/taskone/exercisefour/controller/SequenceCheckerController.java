package by.markovsky.taskone.exercisefour.controller;

import by.markovsky.taskone.exercisefour.model.SequenceChecker;
import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class SequenceCheckerController {

    public static void main(String[] args) {
        int N = 1234;
        View.print("Number: " + N
                + "\nForm of sequence (0 - none; 1 - increasing; -1 - decreasing): " + SequenceChecker.isSequence(N));
    }

}
