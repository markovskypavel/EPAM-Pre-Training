package by.markovsky.taskfive.application.model;

import by.markovsky.taskfive.data.container.CustomArrayList;
import by.markovsky.taskfive.domain.entity.car.Automobile;

/**
 * Created by Pavel Markovsky on 19.02.2018.
 */
public class ShowroomCounter {

    public static int countAutomobilePrice(CustomArrayList<Automobile> automobiles) {
        int sumPrice = 0;
        for (Automobile automobile : automobiles) {
            sumPrice += automobile.getPrice();
        }
        return sumPrice;
    }

    public static int findHighestPricedAutomobile(CustomArrayList<Automobile> automobiles) {
        int highestPrice = 0;
        for (Automobile automobile : automobiles) {
            if (automobile.getPrice() > highestPrice) {
                highestPrice = automobile.getPrice();
            }
        }
        return highestPrice;
    }

}
