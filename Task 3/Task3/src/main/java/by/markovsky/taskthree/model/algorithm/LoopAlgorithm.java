package by.markovsky.taskthree.model.algorithm;

import java.util.Random;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class LoopAlgorithm {

    public static final int MIN_NATURAL_DIVIDER = 1;

    //Exercise 1
    //Count how many times heads or tails dropped
    public static boolean dropCoin() {
        return new Random().nextBoolean();
    }
    public static int countFirstSide(int time) {
        int oneSide = 0;
        for (int i = 0; i < time; i++) {
            if (dropCoin()) {
                oneSide++;
            }
        }
        return oneSide;
    }
    public static int countSecondSide(int allSide, int oneSide) { //It needs just to avoid using calculations in controller
        return allSide - oneSide;
    }

    //Exercise 2
    //Part 1: Find the biggest numeral of natural number
    public static int findBiggestNumeral(final int enteredNumber) {
        int number = enteredNumber;
        int biggestNum = -1;
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
        int number2 = 0;
        for (; number != 0; number /= 10) {
            number2 = number2 * 10 + number % 10;
        }
        return number2;
    }
    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }
    //Part 3: Check of the natural number is simple
    public static boolean isSimple(int number) {
        for (int divider = 2; divider <= Math.sqrt(number); divider++) {
            if (number % divider == 0) {
                return false;
            }
        }
        return true;
    }
    //Part 4: Find all simple dividers of natural number
    public static String findAllSimpleDividers(int number) {
        String simpleDividers = "";
        for (int divider = 2; divider < number; divider++) {
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
    public static int countDifferentNumerals(final int enteredNumber) {
        int number = enteredNumber;
        int diffNumerals = 0;
        for (int checkNumeral = number, repeats = 0; checkNumeral != 0; checkNumeral /= 10, repeats = 0) {
            for (int num = enteredNumber; num != 0; num /= 10) {
                if (checkNumeral % 10 == num % 10) {
                    repeats++;
                }
            }
            if (repeats == 1)
                diffNumerals++;
        }
        return diffNumerals;
    }

    //Exercise 3
    //Check if the natural number is perfect or not
    public static int countDividerSum(int number) {
        int dividerSum = 0;
        for (int divider = MIN_NATURAL_DIVIDER; number != divider; divider++) {
            if (number % divider == 0) {
                dividerSum += divider;
            }
        }
        return dividerSum;
    }
    public static boolean isPerfectNumber(int number) {
        return number == countDividerSum(number);
    }

}
