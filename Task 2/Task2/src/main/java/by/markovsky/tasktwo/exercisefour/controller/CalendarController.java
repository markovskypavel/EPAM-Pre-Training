package by.markovsky.tasktwo.exercisefour.controller;

import by.markovsky.tasktwo.view.View;

import static by.markovsky.tasktwo.exercisefour.model.Calendar.toNextDate;

/**
 * Created by Pavel Markovsky on 05.02.2018.
 */
public class CalendarController {

    public static void main(String[] args) {
        int day = 28, month = 2, year = 2024; //Date
        View.print("The date of the next day is " + toNextDate(day, month, year));
    }

}
