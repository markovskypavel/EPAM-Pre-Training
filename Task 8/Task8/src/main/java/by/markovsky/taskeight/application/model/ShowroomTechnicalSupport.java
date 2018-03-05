package by.markovsky.taskeight.application.model;

import by.markovsky.taskeight.domain.entity.car.Moveable;
import by.markovsky.taskeight.domain.entity.showroom.AutoShowroom;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class ShowroomTechnicalSupport {

    public static String checkAllAutomobile(AutoShowroom autoShowroom) {
        StringBuilder checkState = new StringBuilder();
        for (Moveable key : autoShowroom.getAutomobiles()) {
            checkState.append(key.move() + "\n");
        }
        return checkState.toString();
    }

}
