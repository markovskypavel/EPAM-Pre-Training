package by.markovsky.taskone.exercisefour.model;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class SequenceChecker {

    public static final int OPERATION = 3; //A quantity of operations

    //Check if numerals of a number create a decreasing or increasing sequence
    public static int isSequence(final int enteredNumber) {
        int number = enteredNumber;
        int num4 = number % 10;
        int num3 = (number /= 10) % 10;
        int num2 = (number /= 10) % 10;
        int num1 = (number / 10) % 10;
        int check = (num2 - num1) / Math.abs(num2 - num1);
        check += (num3 - num2) / Math.abs(num3 - num2);
        check += (num4 - num3) / Math.abs(num4 - num3);
        return check / OPERATION;
    }

}
