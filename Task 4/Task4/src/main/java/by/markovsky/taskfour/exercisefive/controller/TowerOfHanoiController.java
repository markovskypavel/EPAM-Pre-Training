package by.markovsky.taskfour.exercisefive.controller;

import by.markovsky.taskfour.exercisefive.model.TowerOfHanoi;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class TowerOfHanoiController {

    public static void main(String[] args) {
        int nDisks = 3;
        TowerOfHanoi.doTowers(nDisks, 'A', 'B', 'C');
    }

}
