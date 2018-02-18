package by.markovsky.taskfive.presentation.controller;

import by.markovsky.taskfive.data.container.CustomArrayList;
import by.markovsky.taskfive.domain.entity.car.LightElectromobile;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class AutoShowroomController {

    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>(1, 2);

/*        LightElectromobile[] lightElectromobiles = new LightElectromobile[2];
        lightElectromobiles[0] = new LightElectromobile();
        lightElectromobiles[1] = new LightElectromobile();
        System.out.println(Arrays.toString(lightElectromobiles));
        lightElectromobiles[0] = null;
        lightElectromobiles[1] = null;
        System.out.println(Arrays.toString(lightElectromobiles));*/

        customArrayList.addSeveral(3, 2, 3);
        System.out.println(customArrayList.get(2));
        customArrayList.remove(2);
        System.out.println(customArrayList.toString());
    }

}
