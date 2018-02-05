package by.markovsky.tasktwo.exercisefour.model;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class Calendar {

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    //Shows the next day of entered data
    public static String toNextDate(int day, int month, int year) {
        String nextDate;
        if (day == 31 && month == DECEMBER) {
            nextDate = "01.01." + ++year; //Change of the year
        } else if ((((day == 28 && (year % 4 != 0 || year % 100 == 0)) || (day == 29 && (year % 4 == 0 || year % 400 == 0))) && month == FEBRUARY)
                || (day == 31 && (month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month == OCTOBER))
                || (day == 30 && (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER))) {
            nextDate = "01." + (++month < 10 ? "0" + month : month) + "." + year; //Change of the month
        } else {
            nextDate = (++day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year; //Change of the day
        }
        return nextDate;
    }

}
