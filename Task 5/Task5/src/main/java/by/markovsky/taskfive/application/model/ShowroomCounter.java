package by.markovsky.taskfive.application.model;

import by.markovsky.taskfive.domain.entity.car.Automobile;
import by.markovsky.taskfive.domain.entity.showroom.AutoShowroom;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class ShowroomCounter {

    public static int countAutomobilePrice(AutoShowroom autoShowroom) {
        int sumPrice = 0;
        for (Automobile automobile : autoShowroom.getAutomobiles()) {
            sumPrice += automobile.getPrice();
        }
        return sumPrice;
    }

    public static int findHighestPricedAutomobile(AutoShowroom autoShowroom) {
        int highestPrice = 0;
        for (Automobile automobile : autoShowroom.getAutomobiles()) {
            if (automobile.getPrice() > highestPrice) {
                highestPrice = automobile.getPrice();
            }
        }
        return highestPrice;
    }

}
