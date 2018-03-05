package by.markovsky.taskeight.application.model;

import by.markovsky.taskeight.application.model.util.Searcher;
import by.markovsky.taskeight.application.model.util.Sorter;
import by.markovsky.taskeight.data.container.CustomArrayList;
import by.markovsky.taskeight.data.container.CustomList;
import by.markovsky.taskeight.domain.entity.car.Automobile;
import by.markovsky.taskeight.domain.entity.car.LightAutomobile;
import by.markovsky.taskeight.domain.entity.car.LightElectromobile;
import by.markovsky.taskeight.domain.entity.showroom.AutoShowroom;

import java.util.Arrays;

/**
 * Created by Pavel Markovsky on 04.03.2018.
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

    /**
     * Tried to make a generic for 2 upper methods, but it works crookedly
     */
/*    public static <T> CustomList<T> getAutos(Class<T> c, AutoShowroom autoShowroom, CustomList<T> container) throws IllegalAccessException, InstantiationException {
        for (Automobile automobile : autoShowroom.getAutomobiles()) {
            if (automobile.getClass().isInstance(c.newInstance())) {
                container.add((T) automobile);
            }
        }
        return container;
    }*/

    public static CustomList<Automobile> sortAutomobilesByName(AutoShowroom autoShowroom) {
        Automobile[] automobiles = Arrays.copyOf(autoShowroom.getAutomobiles().toArray(), autoShowroom.getAutomobiles().size(), Automobile[].class);
        Sorter.quickSort(automobiles);
        return new CustomArrayList<>(automobiles);
    }

    public static int findAutomobileIndexByName(AutoShowroom autoShowroom, Automobile automobile){
        autoShowroom.setAutomobiles(sortAutomobilesByName(autoShowroom));
        Automobile[] automobiles = Arrays.copyOf(autoShowroom.getAutomobiles().toArray(), autoShowroom.getAutomobiles().size(), Automobile[].class);
        return Searcher.binarySearch(automobiles, automobile);
    }

}
