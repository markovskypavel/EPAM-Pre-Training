package by.markovsky.taskfour.exercisefive.controller;

import by.markovsky.taskfour.exercisefive.model.TowerOfHanoi;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class TowerOfHanoiController {

    public static void main(String[] args) {
        int diskAmount = 4;
        View.print("==Tower of Hanoi solution with " + diskAmount + " disks==");
        for (String solution : TowerOfHanoi.getHanoiTowerSolution(diskAmount, 'A', 'B', 'C')) {
            View.print(solution);
        }
    }

}
