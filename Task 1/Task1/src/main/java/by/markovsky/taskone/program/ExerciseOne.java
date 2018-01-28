package by.markovsky.taskone.program;

import by.markovsky.taskone.algorithm.BasicAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pavel Markovsky on 27.01.2018.
 */
public class ExerciseOne {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter dinosaur's weight in grams: ");
        try {
            int dinoWeight = Integer.parseInt(reader.readLine());
            System.out.println("===Weight of dinosaur===\n" +
                    "Grams: " + dinoWeight +
                    "\nKilogram: " + BasicAlgorithm.toKilogram(dinoWeight) +
                    "\nTon: " + BasicAlgorithm.toTon(dinoWeight));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Unknown symbols in thread");
        }
    }

}
