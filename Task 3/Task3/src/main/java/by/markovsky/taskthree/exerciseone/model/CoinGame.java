package by.markovsky.taskthree.exerciseone.model;

import java.util.Random;

/**
 * Created by Pavel Markovsky on 06.02.2018.
 */
public class CoinGame {

    public static final int COUNTING_START = 0;

    //Count how many times heads or tails dropped
    public static int countOneSide(int time) {
        int oneSide = COUNTING_START;
        for (int i = 0; i < time; i++) {
            if (new Random().nextBoolean()) {
                oneSide++;
            }
        }
        return oneSide;
    }

}
