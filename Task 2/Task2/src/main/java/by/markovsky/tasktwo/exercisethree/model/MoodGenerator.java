package by.markovsky.tasktwo.exercisethree.model;

import java.util.Random;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class MoodGenerator {

    public static final int MOOD_QUANTITY = 8;
    public static final String GOOD = ":)";
    public static final String BAD = ":(";
    public static final String KISS = ":*";
    public static final String XD = "xD";
    public static final String CONFUSED = ":S";
    public static final String POKERFACE = ":|";
    public static final String SURPRISE = ":O";
    public static final String BEST = "C:";
    public static final String NO_MOOD = "no mood detected...";

    //Shows the mood of person by random number
    public static String predictMood() {
        String currMood;
        switch (new Random(System.currentTimeMillis()).nextInt(MOOD_QUANTITY)) {
            case 0:
                currMood = BEST;
                break;
            case 1:
                currMood = GOOD;
                break;
            case 2:
                currMood = BAD;
                break;
            case 3:
                currMood = CONFUSED;
                break;
            case 4:
                currMood = KISS;
                break;
            case 5:
                currMood = POKERFACE;
                break;
            case 6:
                currMood = SURPRISE;
                break;
            case 7:
                currMood = XD;
                break;
            default:
                currMood = NO_MOOD;
                break;
        }
        return currMood;
    }

}
