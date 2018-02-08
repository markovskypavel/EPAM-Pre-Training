package by.markovsky.taskone.exercisefive.model;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class NumberArithmetic {

    //Count sum of numerals of number
    public static int countSum(final int enteredNumber) {
        int number = enteredNumber;
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

}
