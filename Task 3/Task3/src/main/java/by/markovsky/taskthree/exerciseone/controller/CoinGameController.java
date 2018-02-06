package by.markovsky.taskthree.exerciseone.controller;

import by.markovsky.taskthree.exerciseone.model.CoinGame;
import by.markovsky.taskthree.view.View;

/**
 * Created by Pavel Markovsky on 03.02.2018.
 */
public class CoinGameController {

    public static void main(String[] args) {
        int totalTries = 1000; //Stub
        int heads = CoinGame.countOneSide(totalTries);
        View.print("Quantity of tries: " + totalTries + "\nHeads: " + heads + "\nTails: " + (totalTries - heads));
    }

}
