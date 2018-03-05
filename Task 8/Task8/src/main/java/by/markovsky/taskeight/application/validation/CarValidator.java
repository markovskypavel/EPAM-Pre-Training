package by.markovsky.taskeight.application.validation;

import by.markovsky.taskeight.domain.entity.car.LightAutomobile;
import by.markovsky.taskeight.domain.entity.car.LightElectromobile;
import by.markovsky.taskeight.exception.WrongAutomobileDataException;

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
