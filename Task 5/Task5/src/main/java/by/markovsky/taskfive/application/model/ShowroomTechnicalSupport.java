package by.markovsky.taskfive.application.model;

import by.markovsky.taskfive.data.container.CustomArrayList;
import by.markovsky.taskfive.domain.entity.car.Automobile;
import by.markovsky.taskfive.domain.entity.car.Moveable;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class ShowroomTechnicalSupport {

    public static String checkAllAutomobile(CustomArrayList<Automobile> automobiles) {
        String checkState = "";
        for (Moveable key : automobiles) {
            checkState += key.move() + "\n";
        }
        return checkState;
    }

}
