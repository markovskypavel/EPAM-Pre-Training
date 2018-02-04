package by.markovsky.taskthree.controller.program;

import by.markovsky.taskthree.model.algorithm.LoopAlgorithm;
import by.markovsky.taskthree.view.View;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class ExerciseOneController {

    public static void main(String[] args) {
        int N = 1000;
        int heads = LoopAlgorithm.countFirstSide(N);
        View.print("Quantity of tries: " + N + "\nHeads: " + heads + "\nTails: " + LoopAlgorithm.countSecondSide(N, heads));
    }

}
