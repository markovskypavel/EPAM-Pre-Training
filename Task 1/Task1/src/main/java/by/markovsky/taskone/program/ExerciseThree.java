package by.markovsky.taskone.program;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class ExerciseThree {

    public static void main(String[] args) {
        double number1 = 4d;
        double number2 = 5d;
        System.out.println("BEFORE=> Number 1: " + number1 + " Number 2: " + number2);
        number2 = (number1 += number2) - number2;
        number1 -= number2;
        System.out.println("AFTER=> Number 1: " + number1 + " Number 2: " + number2);
    }

}
