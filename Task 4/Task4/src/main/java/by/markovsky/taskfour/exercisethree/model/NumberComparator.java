package by.markovsky.taskfour.exercisethree.model;

import by.markovsky.taskfour.exerciseone.model.NumberSum;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class NumberComparator {

    public static boolean equals(int N, int S) {
        return NumberSum.countNumeralSum(N) == S;
    }

}
