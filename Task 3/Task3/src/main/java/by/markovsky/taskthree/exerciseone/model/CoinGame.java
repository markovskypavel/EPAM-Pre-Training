package by.markovsky.taskthree.exerciseone.model;

import by.markovsky.taskthree.exception.TryException;

import java.util.Random;

/**
 * Created by Pavel Markovsky on 06.02.2018.
 */
public class CoinGame {

    public static final int COUNTING_START = 0;
    public static final int MIN_TRY = 0;

    //Count how many times heads or tails dropped
    public static int countOneSide(int time) throws TryException {
        if (time < MIN_TRY) {
            throw new TryException("The quantity of tries cannot be less than 0.");
        }
        int oneSide = COUNTING_START;
        Random random = new Random();
        for (int i = 0; i < time; i++) {
            if (random.nextBoolean()) {
                oneSide++;
            }
        }
        return oneSide;
    }

}
