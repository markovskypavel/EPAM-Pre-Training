package by.markovsky.tasktwo.exercisefive.model;

import by.markovsky.tasktwo.exception.RangeException;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class IntConverter {

    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 999;

    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final String THREE = "Three";
    public static final String FOUR = "Four";
    public static final String FIVE = "Five";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";

    public static final String ELEVEN = "Eleven";
    public static final String TWELVE = "Twelve";
    public static final String THIRTEEN = "Thirteen";
    public static final String FOURTEEN = "Fourteen";
    public static final String FIFTEEN = "Fifteen";
    public static final String SIXTEEN = "Sixteen";
    public static final String SEVENTEEN = "Seventeen";
    public static final String EIGHTEEN = "Eighteen";
    public static final String NINETEEN = "Nineteen";

    public static final String TEN = "Ten";
    public static final String TWENTY = "Twenty ";
    public static final String THIRTY = "Thirty ";
    public static final String FOURTY = "Fourty ";
    public static final String FIFTY = "Fifty ";
    public static final String SIXTY = "Sixty ";
    public static final String SEVENTY = "Seventy ";
    public static final String EIGHTY = "Eighty ";
    public static final String NINETY = "Ninety ";

    public static final String HUNDRED = " Hundred and ";

    //Convert numeral number to string pronouns
    public static String intToString(int enteredNumber) throws RangeException {
        if (enteredNumber <= MIN_NUMBER || enteredNumber > MAX_NUMBER) {
            throw new RangeException("Out of the range. The number should be between 1 and 999.");
        }
        int number = enteredNumber;
        String stringNum = "";
        switch ((number / 100) % 10) {
            case 1:
                stringNum += ONE + HUNDRED;
                break;
            case 2:
                stringNum += TWO + HUNDRED;
                break;
            case 3:
                stringNum += THREE + HUNDRED;
                break;
            case 4:
                stringNum += FOUR + HUNDRED;
                break;
            case 5:
                stringNum += FIVE + HUNDRED;
                break;
            case 6:
                stringNum += SIX + HUNDRED;
                break;
            case 7:
                stringNum += SEVEN + HUNDRED;
                break;
            case 8:
                stringNum += EIGHT + HUNDRED;
                break;
            case 9:
                stringNum += NINE + HUNDRED;
                break;
        }

        switch (number % 100) {
            case 10:
                stringNum += TEN;
                break;
            case 11:
                stringNum += ELEVEN;
                break;
            case 12:
                stringNum += TWELVE;
                break;
            case 13:
                stringNum += THIRTEEN;
                break;
            case 14:
                stringNum += FOURTEEN;
                break;
            case 15:
                stringNum += FIFTEEN;
                break;
            case 16:
                stringNum += SIXTEEN;
                break;
            case 17:
                stringNum += SEVENTEEN;
                break;
            case 18:
                stringNum += EIGHTEEN;
                break;
            case 19:
                stringNum += NINETEEN;
                break;
        }

        switch ((number / 10) % 10) {
            case 1:
                return stringNum;
            case 2:
                stringNum += TWENTY;
                break;
            case 3:
                stringNum += THIRTY;
                break;
            case 4:
                stringNum += FOURTY;
                break;
            case 5:
                stringNum += FIFTY;
                break;
            case 6:
                stringNum += SIXTY;
                break;
            case 7:
                stringNum += SEVENTY;
                break;
            case 8:
                stringNum += EIGHTY;
                break;
            case 9:
                stringNum += NINETY;
                break;
        }

        switch (number % 10) {
            case 1:
                stringNum += ONE;
                break;
            case 2:
                stringNum += TWO;
                break;
            case 3:
                stringNum += THREE;
                break;
            case 4:
                stringNum += FOUR;
                break;
            case 5:
                stringNum += FIVE;
                break;
            case 6:
                stringNum += SIX;
                break;
            case 7:
                stringNum += SEVEN;
                break;
            case 8:
                stringNum += EIGHT;
                break;
            case 9:
                stringNum += NINE;
                break;
        }

        return stringNum;
    }

}
