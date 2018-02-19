package by.markovsky.taskfive.presentation.controller;

import by.markovsky.taskfive.application.model.ShowroomCounter;
import by.markovsky.taskfive.application.model.ShowroomManagement;
import by.markovsky.taskfive.application.model.ShowroomSorter;
import by.markovsky.taskfive.application.model.ShowroomTechnicalSupport;
import by.markovsky.taskfive.domain.entity.car.LightAutomobile;
import by.markovsky.taskfive.domain.entity.car.LightElectromobile;
import by.markovsky.taskfive.domain.entity.showroom.AutoShowroom;
import by.markovsky.taskfive.domain.enumeration.OilType;
import by.markovsky.taskfive.domain.enumeration.ShiftBoxType;
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

        showroomManagement.addNewAutomobile(new LightElectromobile("Tesla Model D", "Red", 120000, 4, 4120, true, 740, 5000, 400));
        showroomManagement.addNewAutomobile(new LightElectromobile("Tesla Model S", "Black", 119000, 4, 4120, false, 540, 3500, 350));
        showroomManagement.addNewAutomobile(new LightAutomobile("Audi RS6", "White", 215000, 4, 4100, 560, 6000, OilType.BENZIN.getOilName(), 4.0, ShiftBoxType.ASGB.getType(), 6));
        showroomManagement.addNewAutomobile(new LightAutomobile("Audi RS5", "Red", 115000, 4, 3900, 330, 5000, OilType.BENZIN.getOilName(), 4.2, ShiftBoxType.ASGB.getType(), 5));
        showroomManagement.addNewAutomobile(new LightAutomobile("Audi RS4", "Black", 95000, 4, 3700, 290, 4000, OilType.DIESEL.getOilName(), 4.2, ShiftBoxType.RSGB.getType(), 5));

        View.print(showroomManagement.getAutoShowroom().getAutomobiles());
        showroomManagement.removeAutomobile("Audi RS5");
        View.print(showroomManagement.getAutoShowroom().getAutomobiles());

        View.print(ShowroomCounter.countAutomobilePrice(showroomManagement.getAutoShowroom().getAutomobiles()));
        View.print(ShowroomCounter.findHighestPricedAutomobile(showroomManagement.getAutoShowroom().getAutomobiles()));

        View.print(ShowroomSorter.getAllElectromobiles(showroomManagement.getAutoShowroom().getAutomobiles()));
        View.print(ShowroomSorter.getAllOilAutomobiles(showroomManagement.getAutoShowroom().getAutomobiles()));

        View.print(ShowroomTechnicalSupport.checkAllAutomobile(showroomManagement.getAutoShowroom().getAutomobiles()));
    }

}
