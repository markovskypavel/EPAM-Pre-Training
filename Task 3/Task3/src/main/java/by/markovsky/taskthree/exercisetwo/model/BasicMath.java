package by.markovsky.taskthree.exercisetwo.model;

import by.markovsky.taskthree.exception.NumberException;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class BasicMath {

    public static final int NOT_NUMERAL = -1;
    public static final int MIN_NUMERAL = 0;
    public static final int FIRST_SIMPLE_NUMBER = 2;
    public static final int REPEAT = 1;

    //Part 1: Find the biggest numeral of natural number
    public static int findBiggestNumeral(final int enteredNumber) {
        int number = Math.abs(enteredNumber);
        int biggestNum = NOT_NUMERAL;
        for (int numeral = number % 10; number != 0; numeral = (number /= 10) % 10) {
            if (numeral > biggestNum) {
                biggestNum = numeral;
            }
        }
        return biggestNum;
    }

    //Part 2: Check if the number is palindrome
    public static int reverseNumber(final int enteredNumber) {
        int number = enteredNumber;
        int reversedNumber = 0;
        for (; number != 0; number /= 10) {
            reversedNumber = reversedNumber * 10 + number % 10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    //Part 3: Check of the natural number is simple
    public static boolean isSimple(int number) {
        boolean simple = true;
        if (number < FIRST_SIMPLE_NUMBER) {
            simple = false;
        }
        int range = (int) Math.sqrt(number);
        for (int divider = FIRST_SIMPLE_NUMBER; divider <= range; divider++) {
            if (number % divider == 0) {
                simple = false;
            }
        }
        return simple;
    }

    //Part 4: Find all simple dividers of natural number
    public static String findAllSimpleDividers(int number) throws NumberException {
        if (number < MIN_NUMERAL) {
            throw new NumberException("Number cannot be less than 0.");
        }
        String simpleDividers = "";
        for (int divider = FIRST_SIMPLE_NUMBER; divider <= number; divider++) {
            if (number % divider == 0 && isSimple(divider)) {
                simpleDividers += divider + " ";
            }
        }
        return simpleDividers;
    }

    //Part 5: Find the biggest divider and the smallest multiple of 2 numbers
    public static int findBiggestDivider(final int enteredNumber1, final int enteredNumber2) throws NumberException {
        if (enteredNumber1 <= MIN_NUMERAL || enteredNumber1 <= MIN_NUMERAL) {
            throw new NumberException("Numbers cannot be less than 0 or equal 0.");
        }
        int number1 = enteredNumber1;
        int number2 = enteredNumber2;
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }
        return number1 + number2;
    }
    public static int findSmallestMultiple(int number1, int number2) throws NumberException {
        return number1 * number2 / findBiggestDivider(number1, number2);
    }

    //Part 6: Find quantity of different numerals of number
    public static int countNumeralRepeats(int fullNumber, int numeral) {
        int repeats = 0;
        for (int number = fullNumber; number != 0; number /= 10) {
            if (numeral == number % 10) {
                repeats++;
            }
        }
        return repeats;
    }
    public static int countDifferentNumerals(final int enteredNumber) {
        int number = enteredNumber;
        int diffNumerals = 0;
        for (int checkNumeral = number; checkNumeral != 0; checkNumeral /= 10) {
            if (countNumeralRepeats(checkNumeral, checkNumeral % 10) == REPEAT) {
                diffNumerals++;
            }
        }
        return diffNumerals;
    }

}
