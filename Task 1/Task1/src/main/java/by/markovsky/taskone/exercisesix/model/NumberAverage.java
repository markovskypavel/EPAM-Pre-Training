package by.markovsky.taskone.exercisesix.model;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class NumberAverage {

    public static final int NUMERAL_NUMBER = 6; //A quantity of numbers in number

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

}
