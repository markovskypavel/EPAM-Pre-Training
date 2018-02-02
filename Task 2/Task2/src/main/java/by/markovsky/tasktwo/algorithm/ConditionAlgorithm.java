package by.markovsky.tasktwo.algorithm;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.markovsky.tasktwo.algorithm.DragonAppearance.*;
import static by.markovsky.tasktwo.algorithm.DragonYears.*;
import static by.markovsky.tasktwo.algorithm.Month.*;
import static by.markovsky.tasktwo.algorithm.Mood.*;
import static by.markovsky.tasktwo.algorithm.StringNumber.*;
import static by.markovsky.tasktwo.algorithm.Vowel.*;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ConditionAlgorithm {

    //Exercise 1
    //Count quantities of dragon's eyes and heads
    public static int countDragonHeads(int year) {
        int head; //+3 heads from the birthday
        if (year >= MAX_POINT_SECOND_PERIOD) {
            head = THIRD_INTERVAL_HEAD_PER_YEAR * (year - MAX_POINT_SECOND_PERIOD) + SECOND_INTERVAL * SECOND_INTERVAL_HEAD_PER_YEAR
                    + FIRST_INTERVAL * FIRST_INTERVAL_HEAD_PER_YEAR + BIRTH_YEARS; //<==> 1*(year-300)+100*2+200*3+3
        } else if (year > MAX_POINT_FIRST_PERIOD && year < MAX_POINT_SECOND_PERIOD) {
            head = SECOND_INTERVAL_HEAD_PER_YEAR * (year - MAX_POINT_FIRST_PERIOD)
                    + FIRST_INTERVAL * FIRST_INTERVAL_HEAD_PER_YEAR + BIRTH_YEARS; //<==> 2*(year-200)+200*3+3
        } else {
            head = year * FIRST_INTERVAL_HEAD_PER_YEAR + BIRTH_YEARS; //<==> year*3+3
        }
        return head;
    }
    //Count quantity of dragon's eyes
    public static int countDragonEyes(int head) {
        return head * EYES_QUANTITY;
    }

    //Exercise 2
    //Check if the letter is vowel or consonant (10 variants)
    public static boolean isVowel1(char letter) { //The first variant
        boolean vowel = false;
        if (letter == A || letter == E || letter == I || letter == O || letter == U) {
            vowel = true;
        }
        return vowel;
    }
    public static boolean isVowel12(char letter) { //The second variant of isVowel1
        boolean vowel;
        if (letter == A || letter == E || letter == I || letter == O || letter == U) {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }
    public static boolean isVowel13(char letter) { //The third variant of isVowel1
        return (letter == A || letter == E || letter == I || letter == O || letter == U);
    }
    public static boolean isVowel14(char letter) { //The fourth variant of isVowel1
        return (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117);
    }

    public static boolean isVowel2(char letter) { //The second variant
        boolean vowel;
        if (letter == A) {
            vowel = true;
        } else if (letter == E) {
            vowel = true;
        } else if (letter == I) {
            vowel = true;
        } else if (letter == O) {
            vowel = true;
        } else if (letter == U) {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }

    public static boolean isVowel3(char letter) { //The third variant
        boolean vowel;
        switch (letter) {
            case A:
                vowel = true;
                break;
            case E:
                vowel = true;
                break;
            case I:
                vowel = true;
                break;
            case O:
                vowel = true;
                break;
            case U:
                vowel = true;
                break;
            default:
                vowel = false;
                break;
        }
        return vowel;
    }
    public static boolean isVowel32(char letter) { //The second variant of isVowel3
        boolean vowel;
        switch (letter) {
            case 97:
                vowel = true;
                break;
            case 101:
                vowel = true;
                break;
            case 105:
                vowel = true;
                break;
            case 111:
                vowel = true;
                break;
            case 117:
                vowel = true;
                break;
            default:
                vowel = false;
                break;
        }
        return vowel;
    }

    public static boolean isVowel4(char letter) { //The fourth variant
        boolean vowel = false;
        if (letter == A) {
            vowel = true;
        }
        if (letter == E) {
            vowel = true;
        }
        if (letter == I) {
            vowel = true;
        }
        if (letter == O) {
            vowel = true;
        }
        if (letter == U) {
            vowel = true;
        }
        return vowel;
    }

    public static boolean isVowel5(char letter) { //The fifth variant
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(String.valueOf(letter));
        return m.matches();
    }

    public static boolean isVowel6(char letter) { //The sixth variant
        char[] vowels = {A, E, I, O, U};
        boolean vowel = false;
        for (char c : vowels) {
            if (c == letter) {
                vowel = true;
            }
        }
        return vowel;
    }

    //Exercise 3
    //Shows the mood of person by random number
    public static String moodSensor() {
        Random random = new Random(System.currentTimeMillis());
        switch (random.nextInt(8)) {
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

    //Exercise 4
    //Shows the next day of entered data
    public static String nextDate(int day, int month, int year) {
        if (month == December.getNumber() && day == 31) {
            return "01.01." + ++year; //Change of the year
        } else if ((((year % 4 == 0 && day == 29) || day == 28) && month == February.getNumber())
                || (day == 31 && (month == January.getNumber() || month == March.getNumber() || month == May.getNumber()
                || month == July.getNumber() || month == August.getNumber() || month == October.getNumber()))
                || (day == 30 && (month == April.getNumber() || month == June.getNumber()
                || month == September.getNumber() || month == November.getNumber()))) {
            return "01." + (++month < 10 ? "0" + month : month) + "." + year; //Change of the month
        } else {
            return (++day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year; //Change of the day
        }
    }

    //Exercise 5
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
