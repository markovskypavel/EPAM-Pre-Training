package by.markovsky.taskfive.presentation.controller;

import by.markovsky.taskfive.application.model.ShowroomCounter;
import by.markovsky.taskfive.application.model.ShowroomManagement;
import by.markovsky.taskfive.application.model.ShowroomSorter;
import by.markovsky.taskfive.application.model.ShowroomTechnicalSupport;
import by.markovsky.taskfive.application.validation.CarValidator;
import by.markovsky.taskfive.domain.entity.car.LightAutomobile;
import by.markovsky.taskfive.domain.entity.car.LightElectromobile;
import by.markovsky.taskfive.domain.entity.showroom.AutoShowroom;
import by.markovsky.taskfive.domain.enumeration.OilType;
import by.markovsky.taskfive.domain.enumeration.ShiftBoxType;
import by.markovsky.taskfive.exception.WrongAutomobileDataException;
import by.markovsky.taskfive.view.View;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class AutoShowroomController {

    public static void main(String[] args) {
        ShowroomManagement showroomManagement = ShowroomManagement.getShowroomManagement();
        showroomManagement.setDirector("Pavel Markovsky");

        AutoShowroom autoShowroom = new AutoShowroom("Markovsky Motors");
        showroomManagement.setAutoShowroom(autoShowroom);

        try {
            LightAutomobile automobile = new LightAutomobile("Audi RS6", "White", 215000, 4, 4100, 560, 6000, OilType.BENZIN.getOilName(), 4.0, ShiftBoxType.ASGB.getType(), 6);
            CarValidator.isLightAutomobileValid(automobile);
            showroomManagement.addNewAutomobile(automobile);

            LightElectromobile electromobile = new LightElectromobile("Tesla Model D", "Red", 120000, 4, 4120, true, 740, 5000, 400);
            CarValidator.isElectromobileValid(electromobile);
            showroomManagement.addNewAutomobile(electromobile);

            electromobile = new LightElectromobile("Tesla Model S", "Black", 119000, 4, 4120, false, 540, 3500, 350);
            CarValidator.isElectromobileValid(electromobile);
            showroomManagement.addNewAutomobile(electromobile);

            automobile = new LightAutomobile("Audi RS5", "Red", 115000, 4, 3900, 330, 5000, OilType.BENZIN.getOilName(), 4.2, ShiftBoxType.ASGB.getType(), 5);
            CarValidator.isLightAutomobileValid(automobile);
            showroomManagement.addNewAutomobile(automobile);

            automobile = new LightAutomobile("Audi RS4", "Black", 95000, 4, 3700, 290, 4000, OilType.DIESEL.getOilName(), 4.2, ShiftBoxType.RSGB.getType(), 5);
            CarValidator.isLightAutomobileValid(automobile);
            showroomManagement.addNewAutomobile(automobile);

            View.print(showroomManagement.getAutoShowroom().getAutomobiles() + "\n");

            showroomManagement.removeAutomobile("Audi RS5");
            View.print(showroomManagement.getAutoShowroom().getAutomobiles() + "\n");

            View.print("Price of autopark: " + ShowroomCounter.countAutomobilePrice(showroomManagement.getAutoShowroom().getAutomobiles()) + "\n");
            View.print("Highest priced auto: " + ShowroomCounter.findHighestPricedAutomobile(showroomManagement.getAutoShowroom().getAutomobiles()) + "\n");

            View.print("===Electromobiles===\n" + ShowroomSorter.getAllElectromobiles(showroomManagement.getAutoShowroom().getAutomobiles()) + "\n");
            View.print("===Oil Automobiles===\n" + ShowroomSorter.getAllOilAutomobiles(showroomManagement.getAutoShowroom().getAutomobiles()) + "\n");

            View.print("===Automobile check===\n" + ShowroomTechnicalSupport.checkAllAutomobile(showroomManagement.getAutoShowroom().getAutomobiles()));
        } catch (WrongAutomobileDataException wade) {
            View.printError(wade.getMessage());
        }
    }

}
