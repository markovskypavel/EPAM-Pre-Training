package by.markovsky.tasktwo.program;

import java.util.Random;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseThree {

    public static final int MOOD_QUANTITY = 8;
    public static final String GOOD = ":)";
    public static final String BAD = ":(";
    public static final String KISS = ":*";
    public static final String XD = "xD";
    public static final String CONFUSED = ":S";
    public static final String POKERFACE = ":|";
    public static final String SURPRISE = ":O";
    public static final String BEST = "C:";
    public static final String NO_MOOD = "...no mood detected";

    public static void main(String[] args) {
        System.out.println("Your mood is " + moodSensor(MOOD_QUANTITY));
    }

    //Shows the mood of person by random number
    public static String moodSensor(int mood) {
        Random random = new Random(System.currentTimeMillis());
        switch (random.nextInt(mood)) {
            case 0:
                return BEST;
            case 1:
                return GOOD;
            case 2:
                return BAD;
            case 3:
                return CONFUSED;
            case 4:
                return KISS;
            case 5:
                return POKERFACE;
            case 6:
                return SURPRISE;
            case 7:
                return XD;
            default:
                return NO_MOOD;
        }
    }

}
