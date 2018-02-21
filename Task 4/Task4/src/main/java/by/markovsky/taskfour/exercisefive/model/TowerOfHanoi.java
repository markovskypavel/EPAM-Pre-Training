package by.markovsky.taskfour.exercisefive.model;

/**
 * Created by Pavel Markovsky on 14.02.2018.
 */
public class TowerOfHanoi {

    //Tower of Hanoi algorithm
    public static String getHanoiTowerSolution(int disk, char from, char temp, char to, StringBuilder stringBuilder) {
        if (disk > 0) {
            getHanoiTowerSolution(disk - 1, from, to, temp, stringBuilder);
            stringBuilder.append(from + " --> " + to + "\n");
            getHanoiTowerSolution(disk - 1, temp, from, to, stringBuilder);
        }
        return stringBuilder.toString();
    }

}
