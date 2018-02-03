package by.markovsky.tasktwo.program;

import by.markovsky.tasktwo.algorithm.ConditionAlgorithm;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseThree {

    public static final int MOOD_QUANTITY = 8;

    public static void main(String[] args) {
        System.out.println("Your mood is " + ConditionAlgorithm.moodSensor(MOOD_QUANTITY));
    }

}
