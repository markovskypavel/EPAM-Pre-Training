package by.markovsky.taskfive.domain.entity.car;

/**
 * Created by Pavel Markovsky on 18.02.2018.
 */
public class LightElectromobile extends Automobile {

    private boolean solarRoof;
    private ElectricEngine electricEngine;

    public LightElectromobile() {
        electricEngine = new ElectricEngine();
    }
    public LightElectromobile(String model, String color, int price,
                              int wheelQuantity, int length,
                              boolean solarRoof,
                              int power, int torque, int batteryCapacity) {
        super(model, color, price, wheelQuantity, length);
        this.solarRoof = solarRoof;
        this.electricEngine = new ElectricEngine(power, torque, batteryCapacity);
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
        this.electricEngine = electricEngine;
    }

    //Getters
    public boolean isSolarRoof() {
        return solarRoof;
    }
    public ElectricEngine getElectricEngine() {
        return electricEngine;
    }

    @Override
    public String move() {
        Startable starter = electricEngine;
        return starter.start() + " -> e-Car is moving -> " + starter.stop();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LightElectromobile that = (LightElectromobile) o;

        if (solarRoof != that.solarRoof) return false;
        return electricEngine != null ? electricEngine.equals(that.electricEngine) : that.electricEngine == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (solarRoof ? 1 : 0);
        result = 31 * result + (electricEngine != null ? electricEngine.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "\nLightElectromobile{" +
                "solarRoof=" + solarRoof +
                ", electricEngine=" + electricEngine +
                '}';
    }

}
