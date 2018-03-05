package by.markovsky.taskeight.domain.entity.car;

/**
 * Created by Pavel Markovsky on 18.02.2018.
 */
public class ElectricEngine extends Engine {

    public static final String START_MESSAGE = "Beep-beep! e-Engine started";
    public static final String STOP_MESSAGE = "Beep! e-Engine stopped";

    private int batteryCapacity;

    public ElectricEngine() {
    }
    public ElectricEngine(int power, int torque, int batteryCapacity) {
        super(power, torque);
        this.batteryCapacity = batteryCapacity;
    }
    public ElectricEngine(ElectricEngine electricEngine) {
        this(electricEngine.power, electricEngine.torque, electricEngine.batteryCapacity);
    }

    //Setters
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    //Getters
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String start() {
        return START_MESSAGE;
    }
    @Override
    public String stop() {
        return STOP_MESSAGE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ElectricEngine that = (ElectricEngine) o;

        return batteryCapacity == that.batteryCapacity;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + batteryCapacity;
        return result;
    }
    @Override
    public String toString() {
        return "ElectricEngine{" +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }

}
