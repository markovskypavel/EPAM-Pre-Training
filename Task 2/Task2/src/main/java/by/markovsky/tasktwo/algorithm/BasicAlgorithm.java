package by.markovsky.tasktwo.algorithm;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class BasicAlgorithm implements Numbers {

    //Exercise 1
    //Count quantities of dragon's eyes and heads
    public static String countDragon(int year) {
        int head; //+3 heads from the birthday
        if (year >= 300) {
            head = year + 503; //<==> (years - 300) + 100 * 2 + 200 * 3 + 3
        } else if (year > 200 && year < 300) {
            head = 2 * year + 203; //<==> 2 * (years - 200) + 200 * 3 + 3
        } else {
            head = year * 3 + 3;
        }
        return head + " heads, " + head * 2 + " eyes";
    }

    //Exercise 2
    //Check if the letter is vowel or consonant (10 variants)
    public static boolean isVowel1(char letter) { //The first variant
        boolean vowel = false;
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            vowel = true;
        }
        return vowel;
    }
    public static boolean isVowel12(char letter) { //The second variant of isVowel1
        boolean vowel;
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }
    public static boolean isVowel13(char letter) { //The third variant of isVowel1
        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
    }
    public static boolean isVowel14(char letter) { //The fourth variant of isVowel1
        return (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117);
    }

    public static boolean isVowel2(char letter) { //The second variant
        boolean vowel;
        if (letter == 'a') {
            vowel = true;
        } else if (letter == 'e') {
            vowel = true;
        } else if (letter == 'i') {
            vowel = true;
        } else if (letter == 'o') {
            vowel = true;
        } else if (letter == 'u') {
            vowel = true;
        } else {
            vowel = false;
        }
        return vowel;
    }

    public static boolean isVowel3(char letter) { //The third variant
        boolean vowel;
        switch (letter) {
            case 'a':
                vowel = true;
                break;
            case 'e':
                vowel = true;
                break;
            case 'i':
                vowel = true;
                break;
            case 'o':
                vowel = true;
                break;
            case 'u':
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
        if (letter == 'a') {
            vowel = true;
        }
        if (letter == 'e') {
            vowel = true;
        }
        if (letter == 'i') {
            vowel = true;
        }
        if (letter == 'o') {
            vowel = true;
        }
        if (letter == 'u') {
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
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
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
        switch (random.nextInt(10)) {
            case 0:
                return ":)";
            case 1:
                return ":|";
            case 2:
                return ":(";
            case 3:
                return ":O";
            case 4:
                return "C:";
            case 5:
                return ":C";
            case 6:
                return ";)";
            case 7:
                return ":*";
            case 8:
                return ":@";
            case 9:
                return "xD";
            default:
                return "no mood detected...";
        }
    }

    //Exercise 4
    //Shows the next day of entered data
    public static String nextDate(int day, int month, int year) {
        if (month == 12 && day == 31) {
            return "01.01." + ++year; //Change of the year
        } else if ((((year % 4 == 0 && day == 29) || day == 28) && month == 2)
                || (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10))
                || (day == 30 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11))) {
            return "01." + (++month < 10 ? "0" + month : month) + "." + year; //Change of the month
        } else {
            return (++day < 10 ? "0" + day : day) + "." + (month < 10 ? "0" + month : month) + "." + year; //Change of the day
        }
    }

    //Exercise 5
    //Convert numeral number to string pronouns
    public static String intToString(int number) {
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
