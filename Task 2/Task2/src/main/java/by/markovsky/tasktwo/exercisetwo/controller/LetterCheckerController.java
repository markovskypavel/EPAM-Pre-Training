package by.markovsky.tasktwo.exercisetwo.controller;

import by.markovsky.tasktwo.view.View;

import java.io.IOException;

import static by.markovsky.tasktwo.exercisetwo.model.LetterChecker.*;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class LetterCheckerController {

    public static void main(String[] args) {
        char letter1 = 'a';
        char letter2 = 'Y';
        char letter3 = 'W';
        try {
            View.print("Your letter is " + letter1
                    + " (" + (isVowel1(letter1) ? "vowel" : "consonant") + ")");
            View.print("Your letter is " + letter2
                    + " (" + (isVowel2(letter2) ? "vowel" : "consonant") + ")");
            View.print("Your letter is " + letter3
                    + " (" + (isVowel3(letter3) ? "vowel" : "consonant") + ")");
        } catch (IOException ioe) {
            View.printError("Letter of english alphabet wasn't entered.");
        }
    }

}
