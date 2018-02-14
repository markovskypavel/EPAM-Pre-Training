package by.markovsky.taskfour.exercisefour.controller;

import by.markovsky.taskfour.exercisefour.model.FibonacciCounter;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class FibonacciCounterController {

    public static void main(String[] args) {
        int number = 12;
        View.print("Fibonacci number (" + number + ") = " + FibonacciCounter.findFibonacciNumber(number));
    }

}
