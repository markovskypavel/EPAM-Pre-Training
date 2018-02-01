package by.markovsky.tasktwo.program;

import by.markovsky.tasktwo.algorithm.BasicAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pavel Markovsky on 30.01.2018.
 */
public class ExerciseTwo {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your english letter: ");
            char letter = (char) reader.read();
            if (!(letter >= 'A' && letter <= 'Z') && !(letter >= 'a' && letter <= 'z')) {
                throw new Exception();
            }
            System.out.println("Your letter is " + letter
                    + " (" + (BasicAlgorithm.isVowel1(Character.toLowerCase(letter)) ? "vowel" : "consonant") + ")");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            System.err.println("It is not an English letter!");
        }
    }

}
