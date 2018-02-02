package by.markovsky.taskone.algorithm;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class BasicAlgorithm {

    public static final double GRAM_IN_KILOGRAM = 1000.;
    public static final double GRAM_IN_TON = 1000000.;
    public static final int NUMERAL_NUMBER = 6; //A quantity of numbers in number (Ex.6)
    public static final int OPERATION = 3; //A quantity of operations (Ex.4)

    //Exercise 1
    //Convert grams to tones
    public static double toTon(int grams) {
        return grams / GRAM_IN_TON;
    }
    //Convert grams to kilos
    public static double toKilogram(int grams) {
        return grams / GRAM_IN_KILOGRAM;
    }

    //Exercise 2
    //Count S of a circle
    public static double findCircleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    //Count area of a ring
    public static double findRingArea(int R1, int R2) {
        return Math.abs(findCircleArea(R1) - findCircleArea(R2));
    }

    //Exercise 4
    //Check if numerals of a number create a decreasing or increasing sequence with loop and condition
    public static String isSequenceLoop(final int enteredNumber) {
        int number = enteredNumber;
        boolean isDecreasing = false;
        boolean isIncreasing = false;
        while (number / 10 != 0) {
            if ((number % 10 < (number / 10) % 10) && !isIncreasing) isDecreasing = true;
            else if ((number % 10 > (number / 10) % 10) && !isDecreasing) isIncreasing = true;
            else return "none";
            number /= 10;
        }
        if (isDecreasing) return "decreasing";
        else return "increasing";
    }
    //Check if numerals of a number create a decreasing or increasing sequence
    public static int isSequence(final int enteredNumber) {
        int number = enteredNumber;
        int num1, num2, num3, num4;
        num4 = number % 10;
        num3 = (number /= 10) % 10;
        num2 = (number /= 10) % 10;
        num1 = (number / 10) % 10;
        int check = (num2 - num1) / Math.abs(num2 - num1);
        check += (num3 - num2) / Math.abs(num3 - num2);
        check += (num4 - num3) / Math.abs(num4 - num3);
        return check / OPERATION;
    }

    //Exercise 5
    //Count sum of numerals of number with loop
    public static int countSumLoop(final int enteredNumber) {
        int number = enteredNumber;
        int sum = 0;
        for (; number != 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
    //Count multiplication of numerals of number with loop
    public static int countMpLoop(final int enteredNumber) {
        int number = enteredNumber;
        int multiplication = 1;
        for (; number != 0; number /= 10) {
            multiplication *= number % 10;
        }
        return multiplication;
    }

    //Count sum of numerals of number
    public static int countSum(final int enteredNumber) { //it is final, because maybe suddenly the parameter can be necessary
        int number = enteredNumber;                         //and also to make the code more understandable for another programmer
        int sum = 0;
        sum += number % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number / 10) % 10;
        return sum;
    }
    //Count multiplication of numerals of number
    public static int countMp(final int enteredNumber) {
        int number = enteredNumber;
        int multiplication = 1;
        multiplication *= number % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number / 10) % 10;
        return multiplication;
    }

    //Exercise 6
    //Count average arithmetic of numerals of number with loop
    public static double avgArithmeticLoop(final int enteredNumber) {
        int number = enteredNumber;
        double sum = 0d;
        int amount = 0;
        for (; number != 0; number /= 10, amount++) {
            sum += number % 10;
        }
        return sum / amount;
    }
    //Count average geometric of numerals of number with loop
    public static double avgGeometricLoop(final int enteredNumber) {
        int number = enteredNumber;
        double multiplication = 1d;
        int amount = 0;
        for (; number != 0; number /= 10, amount++) {
            multiplication *= number % 10;
        }
        return Math.pow(multiplication, 1. / amount);
    }

    //Count average arithmetic of numerals of number
    public static double avgArithmetic(final int enteredNumber) {
        int number = enteredNumber;
        double sum = 0d;
        sum += number % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number / 10) % 10;
        return sum / NUMERAL_NUMBER;
    }
    //Count average geometric of numerals of number
    public static double avgGeometric(final int enteredNumber) {
        int number = enteredNumber;
        double multiplication = 1d;
        multiplication *= number % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number /= 10) % 10;
        multiplication *= (number / 10) % 10;
        return Math.pow(multiplication, 1. / NUMERAL_NUMBER);
    }

    //Exercise 7
    //Reverse number with loop
    public static int reverseLoop(final int enteredNumber) {
        int number = enteredNumber;
        int number2 = 0;
        for (; number != 0; number /= 10) {
            number2 = number2 * 10 + number % 10;
        }
        return number2;
    }
    //Reverse number with loop
    public static int reverse(final int enteredNumber) {
        int number = enteredNumber;
        int number2 = 0;
        number2 = number2 * 10 + number % 10;
        number2 = number2 * 10 + (number /= 10) % 10;
        number2 = number2 * 10 + (number /= 10) % 10;
        number2 = number2 * 10 + (number /= 10) % 10;
        number2 = number2 * 10 + (number /= 10) % 10;
        number2 = number2 * 10 + (number /= 10) % 10;
        number2 = number2 * 10 + (number / 10) % 10;
        return number2;
    }

}
