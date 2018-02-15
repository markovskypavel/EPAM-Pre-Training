package by.markovsky.taskfour.exercisefour.controller;

import by.markovsky.taskfour.exercisefour.model.FibonacciCounter;
import by.markovsky.taskfour.view.View;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class FibonacciCounterController {

    public static void main(String[] args) {
        int index = 8; //Stub
        View.print("Fibonacci number with index " + index + " = " + FibonacciCounter.findFibonacciNumberRecursion(index) + " (recursion)\n"
                + "Fibonacci number with index " + index + " = " + FibonacciCounter.findFibonacciNumberLoop(index) + " (loop)");
    }

}
