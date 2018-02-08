package by.markovsky.taskone.exerciseone.controller;

import by.markovsky.taskone.exerciseone.model.DinosaurConverter;
import by.markovsky.taskone.view.View;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class DinosaurConverterController {

    public static void main(String[] args) {
        int dinoWeight = 12_345_654;
        View.print("===Weight of dinosaur===\n" +
                "Grams: " + dinoWeight +
                "\nKilogram: " + DinosaurConverter.toKilogram(dinoWeight) +
                "\nTon: " + DinosaurConverter.toTon(dinoWeight));
    }

}
