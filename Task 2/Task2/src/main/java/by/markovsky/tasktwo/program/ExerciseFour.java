package by.markovsky.tasktwo.program;


/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseFour {

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

    public static void main(String[] args) {
        int day = 1, month = 2, year = 2018; //Date
        System.out.println("The date of the next day is " + nextDate(day, month, year));
    }

    //Shows the next day of entered data
    public static String nextDate(int day, int month, int year) {
        if (month == DECEMBER && day == 31) {
            return "01.01." + ++year; //Change of the year
        } else if ((((year % 4 == 0 && day == 29) || day == 28) && month == FEBRUARY)
                || (day == 31 && (month == JANUARY || month == MARCH || month == MAY
                || month == JULY || month == AUGUST || month == OCTOBER))
                || (day == 30 && (month == APRIL || month == JUNE
                || month == SEPTEMBER || month == NOVEMBER))) {
            return "01." + (++month < 10 ? "0" + month : month) + "." + year; //Change of the month
        } else {
            return (++day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year; //Change of the day
        }
    }

}
