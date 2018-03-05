package by.markovsky.taskeight.domain.entity.car;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class LightAutomobile extends Automobile {

    private ShiftBox shiftBox;

    public LightAutomobile() {
        this.engine = new OilEngine();
        this.starter = this.engine;
        this.shiftBox = new ShiftBox();
    }
    public LightAutomobile(String model, String color, int price,
                           int wheelQuantity, int length,
                           int power, int torque, String oilType, double volume,
                           String shiftType, int gears) {
        super(model, color, price, wheelQuantity, length);
        this.engine = new OilEngine(power, torque, oilType, volume);
        this.starter = this.engine;
        this.shiftBox = new ShiftBox(shiftType, gears);
    }
    public LightAutomobile(LightAutomobile lightAutomobile) {
        this(lightAutomobile.model, lightAutomobile.color, lightAutomobile.price,
                lightAutomobile.getChassis().getWheelQuantity(), lightAutomobile.getChassis().getLength(),
                lightAutomobile.getOilEngine().getPower(), lightAutomobile.getOilEngine().getTorque(), lightAutomobile.getOilEngine().getOilType(), lightAutomobile.getOilEngine().getVolume(),
                lightAutomobile.getShiftBox().getShiftType(), lightAutomobile.getShiftBox().getGears());
    }

    //Setters
    public void setOilEngine(OilEngine oilEngine) {
        this.engine = oilEngine;
    }
    public void setShiftBox(ShiftBox shiftBox) {
        this.shiftBox = shiftBox;
    }

    //Getters
    public OilEngine getOilEngine() {
        return (OilEngine) engine;
    }
    public ShiftBox getShiftBox() {
        return shiftBox;
    }

    @Override
    public String move() {
        return starter.start() + " -> Automobile is moving -> " + starter.stop();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LightAutomobile that = (LightAutomobile) o;

        return shiftBox != null ? shiftBox.equals(that.shiftBox) : that.shiftBox == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (shiftBox != null ? shiftBox.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "LightAutomobile{" +
                "model=" + model +
                '}';
    }

}
