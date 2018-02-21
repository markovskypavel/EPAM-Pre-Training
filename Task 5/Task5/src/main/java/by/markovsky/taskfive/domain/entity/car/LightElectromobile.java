package by.markovsky.taskfive.domain.entity.car;

/**
 * Created by Pavel Markovsky on 18.02.2018.
 */
public class LightElectromobile extends Automobile {

    private boolean solarRoof;

    public LightElectromobile() {
        engine = new ElectricEngine();
        this.starter = this.engine;
    }
    public LightElectromobile(String model, String color, int price,
                              int wheelQuantity, int length,
                              boolean solarRoof,
                              int power, int torque, int batteryCapacity) {
        super(model, color, price, wheelQuantity, length);
        this.solarRoof = solarRoof;
        this.engine = new ElectricEngine(power, torque, batteryCapacity);
        this.starter = this.engine;
    }
    public LightElectromobile(LightElectromobile lightElectromobile) {
        this(lightElectromobile.model, lightElectromobile.color, lightElectromobile.price,
                lightElectromobile.getChassis().getWheelQuantity(), lightElectromobile.getChassis().getLength(),
                lightElectromobile.solarRoof,
                lightElectromobile.getElectricEngine().getPower(), lightElectromobile.getElectricEngine().getTorque(), lightElectromobile.getElectricEngine().getBatteryCapacity());
    }

    //Setters
    public void setSolarRoof(boolean solarRoof) {
        this.solarRoof = solarRoof;
    }
    public void setElectricEngine(ElectricEngine electricEngine) {
        this.engine = electricEngine;
    }

    //Getters
    public boolean isSolarRoof() {
        return solarRoof;
    }
    public ElectricEngine getElectricEngine() {
        return (ElectricEngine) engine;
    }

    @Override
    public String move() {
        return starter.start() + " -> e-Car is moving -> " + starter.stop();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LightElectromobile that = (LightElectromobile) o;

        return solarRoof == that.solarRoof;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (solarRoof ? 1 : 0);
        return result;
    }
    @Override
    public String toString() {
        return "LightElectromobile{" +
                "solarRoof=" + solarRoof +
                '}';
    }

}
