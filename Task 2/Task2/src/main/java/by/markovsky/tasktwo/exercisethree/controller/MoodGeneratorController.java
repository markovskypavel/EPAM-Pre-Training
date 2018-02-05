package by.markovsky.tasktwo.exercisethree.controller;

import by.markovsky.tasktwo.view.View;

import static by.markovsky.tasktwo.exercisethree.model.MoodGenerator.predictMood;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class MoodGeneratorController {

    public static void main(String[] args) {
        View.print("Your mood is " + predictMood());
    }

}
