package by.markovsky.taskone.exerciseseven.model;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class NumberReverse {

    //Reverse number with loop
    public static int reverse(final int enteredNumber) {
        int number = enteredNumber;
        int reversedNumber = 0;
        reversedNumber = reversedNumber * 10 + number % 10;
        reversedNumber = reversedNumber * 10 + (number /= 10) % 10;
        reversedNumber = reversedNumber * 10 + (number /= 10) % 10;
        reversedNumber = reversedNumber * 10 + (number /= 10) % 10;
        reversedNumber = reversedNumber * 10 + (number /= 10) % 10;
        reversedNumber = reversedNumber * 10 + (number /= 10) % 10;
        reversedNumber = reversedNumber * 10 + (number / 10) % 10;
        return reversedNumber;
    }

}
