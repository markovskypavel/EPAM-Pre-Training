package by.markovsky.tasktwo.exerciseone.controller;

import by.markovsky.tasktwo.view.View;

import java.io.IOException;

import static by.markovsky.tasktwo.exerciseone.model.Dragon.countDragonEyes;
import static by.markovsky.tasktwo.exerciseone.model.Dragon.countDragonHeads;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class DragonController {

    public static void main(String[] args) {
        int dragonAge = 512; //Stub
        try {
            View.print("-Dragon, how old are you?" + "\n-I am " + dragonAge
                    + " years old and I have " + countDragonHeads(dragonAge) + " heads and "
                    + countDragonEyes(dragonAge) + " eyes.");
        } catch (IOException ioe) {
            View.printError("Age of the dragon cannot be less than 1.");
        }
    }

}
