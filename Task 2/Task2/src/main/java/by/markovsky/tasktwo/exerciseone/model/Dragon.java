package by.markovsky.tasktwo.exerciseone.model;

import java.io.IOException;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class Dragon {

    public static final int MIN_YEAR = 0;
    public static final int BIRTH_YEARS = 3;
    public static final int MAX_POINT_FIRST_PERIOD = 200;
    public static final int MAX_POINT_SECOND_PERIOD = 300;
    public static final int FIRST_INTERVAL = 200;
    public static final int SECOND_INTERVAL = 100;
    public static final int FIRST_INTERVAL_HEAD_PER_YEAR = 3;
    public static final int SECOND_INTERVAL_HEAD_PER_YEAR = 2;
    public static final int THIRD_INTERVAL_HEAD_PER_YEAR = 1;
    public static final int EYES_QUANTITY = 2;

    //Count quantities of dragon's eyes and heads
    public static int countDragonHeads(final int year) throws IOException {
        if (year > MIN_YEAR) { //Check of minimal age of dragon
            int head; //+3 heads from the birthday
            if (year >= MAX_POINT_SECOND_PERIOD) {
                head = THIRD_INTERVAL_HEAD_PER_YEAR * year - THIRD_INTERVAL_HEAD_PER_YEAR * MAX_POINT_SECOND_PERIOD
                        + SECOND_INTERVAL * SECOND_INTERVAL_HEAD_PER_YEAR
                        + FIRST_INTERVAL * FIRST_INTERVAL_HEAD_PER_YEAR + BIRTH_YEARS; //<==> 1*(year-300)+100*2+200*3+3
            } else if (year > MAX_POINT_FIRST_PERIOD && year < MAX_POINT_SECOND_PERIOD) {
                head = SECOND_INTERVAL_HEAD_PER_YEAR * year - SECOND_INTERVAL_HEAD_PER_YEAR * MAX_POINT_FIRST_PERIOD
                        + FIRST_INTERVAL * FIRST_INTERVAL_HEAD_PER_YEAR + BIRTH_YEARS; //<==> 2*(year-200)+200*3+3
            } else {
                head = year * FIRST_INTERVAL_HEAD_PER_YEAR + BIRTH_YEARS; //<==> year*3+3
            }
            return head;
        } else {
            throw new IOException();
        }
    }

    //Count quantity of dragon's eyes
    public static int countDragonEyes(final int year) throws IOException {
        return countDragonHeads(year) * EYES_QUANTITY;
    }

}
