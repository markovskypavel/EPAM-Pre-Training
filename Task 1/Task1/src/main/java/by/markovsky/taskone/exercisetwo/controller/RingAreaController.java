package by.markovsky.taskone.exercisetwo.controller;

import by.markovsky.taskone.exercisetwo.model.RingArea;
import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class RingAreaController {

    public static void main(String[] args) {
        int R1 = 2;
        int R2 = 1;
        View.print("R1 = " + R1
                + "\nR2 = " + R2
                + "\nArea of a ring: " + RingArea.findRingArea(R1, R2));
    }

}
