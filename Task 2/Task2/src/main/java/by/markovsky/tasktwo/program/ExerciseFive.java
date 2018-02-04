package by.markovsky.tasktwo.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseFive {

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

    public static final String TEN = "Ten ";
    public static final String TWENTY = "Twenty ";
    public static final String THIRTY = "Thirty ";
    public static final String FOURTY = "Fourty ";
    public static final String FIFTY = "Fifty ";
    public static final String SIXTY = "Sixty ";
    public static final String SEVENTY = "Seventy ";
    public static final String EIGHTY = "Eighty ";
    public static final String NINETY = "Ninety ";

    public static final String HUNDRED = " Hundred and ";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your number: ");
            int number = Integer.parseInt(reader.readLine());
            if (number <= MIN_NUMBER || number > MAX_NUMBER) {
                throw new Exception();
            }
            System.out.println("Your number is " + number + " (" + intToString(number) + ")");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.err.println("Wrong number format.");
        } catch (Exception e) {
            System.err.println("Out of the range. The number should be between 1 and 999.");
        }
    }

    //Convert numeral number to string pronouns
    public static String intToString(final int enteredNumber) {
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
            default:
                break;
        }

        switch (number % 100) {
            case 11:
                return stringNum + ELEVEN;
            case 12:
                return stringNum + TWELVE;
            case 13:
                return stringNum + THIRTEEN;
            case 14:
                return stringNum + FOURTEEN;
            case 15:
                return stringNum + FIFTEEN;
            case 16:
                return stringNum + SIXTEEN;
            case 17:
                return stringNum + SEVENTEEN;
            case 18:
                return stringNum + EIGHTEEN;
            case 19:
                return stringNum + NINETEEN;
            default:
                break;
        }

        switch ((number / 10) % 10) {
            case 1:
                stringNum += TEN;
                break;
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
            default:
                break;
        }

        switch (number % 10) {
            case 1:
                return stringNum + ONE;
            case 2:
                return stringNum + TWO;
            case 3:
                return stringNum + THREE;
            case 4:
                return stringNum + FOUR;
            case 5:
                return stringNum + FIVE;
            case 6:
                return stringNum + SIX;
            case 7:
                return stringNum + SEVEN;
            case 8:
                return stringNum + EIGHT;
            case 9:
                return stringNum + NINE;
            default:
                return stringNum;
        }
    }

}
