package by.markovsky.taskfive.application.model;

import by.markovsky.taskfive.data.container.CustomArrayList;
import by.markovsky.taskfive.domain.entity.car.Automobile;
import by.markovsky.taskfive.domain.entity.car.LightAutomobile;
import by.markovsky.taskfive.domain.entity.car.LightElectromobile;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class ShowroomSorter {

    public static CustomArrayList<LightElectromobile> getAllElectromobiles(CustomArrayList<Automobile> automobiles) {
        CustomArrayList<LightElectromobile> electromobiles = new CustomArrayList<>();
        for (Automobile automobile : automobiles) {
            if (automobile instanceof LightElectromobile) {
                electromobiles.add((LightElectromobile) automobile);
            }
        }
        return electromobiles;
    }

    public static CustomArrayList<LightAutomobile> getAllOilAutomobiles(CustomArrayList<Automobile> automobiles) {
        CustomArrayList<LightAutomobile> lightAutomobiles = new CustomArrayList<>();
        for (Automobile automobile : automobiles) {
            if (automobile instanceof LightAutomobile) {
                lightAutomobiles.add((LightAutomobile) automobile);
            }
        }
        return lightAutomobiles;
    }

    /**Tried to make a generic for 2 upper methods, but it works crookedly*/
/*    public <T> CustomArrayList<T> getAutos(Class<T> c, CustomArrayList<Automobile> automobiles) throws IllegalAccessException, InstantiationException {
        CustomArrayList<T> specialAutomobiles = new CustomArrayList<>();
        for (Automobile automobile : automobiles) {
            if (automobile.getClass().isInstance(c.newInstance())) {
                specialAutomobiles.add((T) automobile);
            }
        }
        return specialAutomobiles;
    }*/

}
