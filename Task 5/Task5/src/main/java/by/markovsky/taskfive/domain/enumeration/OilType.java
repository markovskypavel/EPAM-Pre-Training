package by.markovsky.taskfive.domain.enumeration;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public enum OilType {

    BENZIN("Benzin"), GAS("Gas"), DIESEL("Diesel");

    private String oilName;

    OilType(String oilName) {
        this.oilName = oilName;
    }

    public String getOilName() {
        return oilName;
    }

}
