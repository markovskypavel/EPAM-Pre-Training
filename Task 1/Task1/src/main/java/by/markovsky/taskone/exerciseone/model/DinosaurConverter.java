package by.markovsky.taskone.exerciseone.model;

/**
 * Created by Pavel Markovsky on 08.02.2018.
 */
public class DinosaurConverter {

    public static final double GRAM_IN_KILOGRAM = 1000.;
    public static final double GRAM_IN_TON = 1000000.;

    //Convert grams to tones
    public static double toTon(int grams) {
        return grams / GRAM_IN_TON;
    }

    //Convert grams to kilos
    public static double toKilogram(int grams) {
        return grams / GRAM_IN_KILOGRAM;
    }

}
