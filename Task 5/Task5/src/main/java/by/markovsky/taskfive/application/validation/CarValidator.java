package by.markovsky.taskfive.application.validation;

import by.markovsky.taskfive.domain.entity.car.LightAutomobile;
import by.markovsky.taskfive.domain.entity.car.LightElectromobile;
import by.markovsky.taskfive.exception.WrongAutomobileDataException;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class CarValidator {

    public static boolean isElectromobileValid(LightElectromobile electromobile) throws WrongAutomobileDataException {
        return true;
    }

    public static boolean isLightAutomobileValid(LightAutomobile automobile) throws WrongAutomobileDataException {
        return true;
    }

}
