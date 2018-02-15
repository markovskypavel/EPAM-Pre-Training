package by.markovsky.taskfour.exercisefive.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class TowerOfHanoi {

    private static List<String> solution = new ArrayList();

    //Tower of Hanoi algorithm
    public static List<String> getHanoiTowerSolution(int disk, char from, char temp, char to) {
        if (disk > 0) {
            getHanoiTowerSolution(disk - 1, from, to, temp);
            solution.add(from + " --> " + to);
            getHanoiTowerSolution(disk - 1, temp, from, to);
        }
        return solution;
    }

}
