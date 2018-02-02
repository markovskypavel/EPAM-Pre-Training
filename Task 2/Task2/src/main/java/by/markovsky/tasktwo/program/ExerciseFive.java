package by.markovsky.tasktwo.program;

import by.markovsky.tasktwo.algorithm.ConditionAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseFive {

    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 999;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your number: ");
            int number = Integer.parseInt(reader.readLine());
            if (number <= MIN_NUMBER || number > MAX_NUMBER) {
                throw new Exception();
            }
            System.out.println("Your number is " + number + " (" + ConditionAlgorithm.intToString(number) + ")");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.err.println("Wrong number format.");
        } catch (Exception e) {
            System.err.println("Out of the range. The number should be between 1 and 999.");
        }
    }

}
