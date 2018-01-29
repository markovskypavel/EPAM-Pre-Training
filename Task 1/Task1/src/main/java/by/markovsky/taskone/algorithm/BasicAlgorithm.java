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
    //Check if numerals of a number create a decreasing or increasing sequence with loop and condition
    public static String isSequenceLoop(int number) {
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
    public static int isSequence(int number) {
        int num1, num2, num3, num4;
        num4 = number % 10;
        number /= 10;
        num3 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num1 = number % 10;
        int check = (num2 - num1) / Math.abs(num2 - num1);
        check += (num3 - num2) / Math.abs(num3 - num2);
        check += (num4 - num3) / Math.abs(num4 - num3);
        check /= 3;
        return check;
    }

    //Exercise 5
    //Count sum of numerals of number with loop
    public static int countSumLoop(int number) {
        int sum = 0;
        for (; number != 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
    //Count multiplication of numerals of number with loop
    public static int countMpLoop(int number) {
        int multiplication = 1;
        for (; number != 0; number /= 10) {
            multiplication *= number % 10;
        }
        return multiplication;
    }
    //Count sum of numerals of number
    public static int countSum(int number) {
        int sum = 0;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        return sum;
    }
    //Count multiplication of numerals of number
    public static int countMp(int number) {
        int multiplication = 1;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        return multiplication;
    }

    //Exercise 6
    //Count average arithmetic of numerals of number with loop
    public static double avgArithmeticLoop(int number) {
        double sum = 0d;
        int amount = 0;
        for (; number != 0; number /= 10, amount++) {
            sum += number % 10;
        }
        return sum / amount;
    }
    //Count average geometric of numerals of number with loop
    public static double avgGeometricLoop(int number) {
        double multiplication = 1d;
        int amount = 0;
        for (; number != 0; number /= 10, amount++) {
            multiplication *= number % 10;
        }
        return Math.pow(multiplication, 1. / amount);
    }
    //Count average arithmetic of numerals of number
    public static double avgArithmetic(int number) {
        double sum = 0d;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        number /= 10;
        sum += number % 10;
        return sum / 6;
    }
    //Count average geometric of numerals of number
    public static double avgGeometric(int number) {
        double multiplication = 1d;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        number /= 10;
        multiplication *= number % 10;
        return Math.pow(multiplication, 1. / 6);
    }

    //Exercise 7
    //Reverse number with loop
    public static int reverseLoop(int number) {
        int number2 = 0;
        for (; number != 0; number /= 10) {
            number2 = number2 * 10 + number % 10;
        }
        return number2;
    }
    //Reverse number with loop
    public static int reverse(int number) {
        int number2 = 0;
        number2 = number2 * 10 + number % 10;
        number /= 10;
        number2 = number2 * 10 + number % 10;
        number /= 10;
        number2 = number2 * 10 + number % 10;
        number /= 10;
        number2 = number2 * 10 + number % 10;
        number /= 10;
        number2 = number2 * 10 + number % 10;
        number /= 10;
        number2 = number2 * 10 + number % 10;
        number /= 10;
        number2 = number2 * 10 + number % 10;
        return number2;
    }

}
