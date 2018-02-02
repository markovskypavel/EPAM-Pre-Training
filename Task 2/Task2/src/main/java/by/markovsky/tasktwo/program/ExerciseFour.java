package by.markovsky.tasktwo.program;

import by.markovsky.tasktwo.algorithm.ConditionAlgorithm;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseFour {

    public static void main(String[] args) {
        int day = 1, month = 2, year = 2018; //Date
        System.out.println("The date of the next day is " + ConditionAlgorithm.nextDate(day, month, year));
    }

}
