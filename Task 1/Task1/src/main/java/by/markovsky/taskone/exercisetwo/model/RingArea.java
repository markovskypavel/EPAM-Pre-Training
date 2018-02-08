package by.markovsky.taskone.exercisetwo.model;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class RingArea {

    //Count S of a circle
    public static double findCircleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    //Count area of a ring
    public static double findRingArea(int R1, int R2) {
        return Math.abs(findCircleArea(R1) - findCircleArea(R2));
    }

}
