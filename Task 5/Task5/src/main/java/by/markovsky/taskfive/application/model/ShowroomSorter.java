package by.markovsky.taskfive.application.model;

import by.markovsky.taskfive.data.container.CustomList;
import by.markovsky.taskfive.domain.entity.car.Automobile;
import by.markovsky.taskfive.domain.entity.car.LightAutomobile;
import by.markovsky.taskfive.domain.entity.car.LightElectromobile;
import by.markovsky.taskfive.domain.entity.showroom.AutoShowroom;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class ShowroomSorter {

    public static CustomList<LightElectromobile> getAllElectromobiles(AutoShowroom autoShowroom, CustomList<LightElectromobile> container) {
        for (Automobile automobile : autoShowroom.getAutomobiles()) {
            if (automobile instanceof LightElectromobile) {
                container.add((LightElectromobile) automobile);
            }
        }
        return container;
    }

    public static CustomList<LightAutomobile> getAllOilAutomobiles(AutoShowroom autoShowroom, CustomList<LightAutomobile> container) {
        for (Automobile automobile : autoShowroom.getAutomobiles()) {
            if (automobile instanceof LightAutomobile) {
                container.add((LightAutomobile) automobile);
            }
        }
        return container;
    }

    /**Tried to make a generic for 2 upper methods, but it works crookedly*/
/*    public <T> CustomList<T> getAutos(Class<T> c, AutoShowroom autoShowroom, CustomList<T> container) throws IllegalAccessException, InstantiationException {
        for (Automobile automobile : autoShowroom.getAutomobiles()) {
            if (automobile.getClass().isInstance(c.newInstance())) {
                container.add((T) automobile);
            }
        }
        return container;
    }*/

}
