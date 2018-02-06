package by.markovsky.taskthree.exercisetwo.model;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class BasicMath {

    public static final int NOT_NUMERAL = -1;
    public static final int FIRST_SIMPLE_NUMBER = 2;

    //Part 1: Find the biggest numeral of natural number
    public static int findBiggestNumeral(final int enteredNumber) {
        int number = enteredNumber;
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
        for (int divider = FIRST_SIMPLE_NUMBER; divider <= Math.sqrt(number); divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }

    //Part 4: Find all simple dividers of natural number
    public static String findAllSimpleDividers(int number) {
        String simpleDividers = "";
        for (int divider = FIRST_SIMPLE_NUMBER; divider <= number; divider++) {
            if (number % divider == 0 && isSimple(divider)) {
                simpleDividers += divider + " ";
            }
        }
        return simpleDividers;
    }

    //Part 5: Find the biggest divider and the smallest multiple of 2 numbers
    public static int findBiggestDivider(final int enteredNumber1, final int enteredNumber2) {
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
    public static int findSmallestMultiple(int number1, int number2) {
        return number1 * number2 / findBiggestDivider(number1, number2);
    }

    //Part 6: Find quantity of different numerals of number
    public static int countNumeralRepeats(int fullNumber, int numeral){
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
            int repeats = countNumeralRepeats(enteredNumber, checkNumeral % 10);
            if (repeats >= 1)
                diffNumerals++;
        }
        return diffNumerals;
    }

}
