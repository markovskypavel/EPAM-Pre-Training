package by.markovsky.taskone.algorithm;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class BasicAlgorithm {

    //Exercise 1
    //Convert grams to tones
    public static double toTon(int grams) {
        return grams / 1000000.;
    }
    //Convert grams to kilos
    public static double toKilogram(int grams) {
        return grams / 1000.;
    }

    //Exercise 2
    //Count area of a ring
    public static double findS(int R1, int R2) {
        return Math.PI * Math.pow(R1, 2) - Math.PI * Math.pow(R2, 2);
    }

    //Exercise 4
    //Check if numerals of a number create a decreasing or increasing sequence
    public static String isSequence(int number) {
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

    //Exercise 5
    //Count sum of numerals of number
    public static int countSum(int number) {
        int sum = 0;
        for (; number != 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
    //Count multiplication of numerals of number
    public static int countMp(int number) {
        int multiplication = 1;
        for (; number != 0; number /= 10) {
            multiplication *= number % 10;
        }
        return multiplication;
    }

    //Exercise 6
    //Count average arithmetic of numerals of number
    public static double avgArithmetic(int number) {
        double sum = 0d;
        int amount = 0;
        for (; number != 0; number /= 10, amount++) {
            sum += number % 10;
        }
        return sum / amount;
    }
    //Count average geometric of numerals of number
    public static double avgGeometric(int number) {
        double multiplication = 1d;
        int amount = 0;
        for (; number != 0; number /= 10, amount++) {
            multiplication *= number % 10;
        }
        return Math.pow(multiplication, 1. / amount);
    }

    //Exercise 7
    //Reverse number
    public static int reverse(int number) {
        int number2 = 0;
        for (; number != 0; number /= 10) {
            number2 = number2 * 10 + number % 10;
        }
        return number2;
    }

}
