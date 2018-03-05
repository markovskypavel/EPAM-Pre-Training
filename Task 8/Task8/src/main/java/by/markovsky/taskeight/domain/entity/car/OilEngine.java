package by.markovsky.taskeight.domain.entity.car;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class OilEngine extends Engine {

    public static final String START_MESSAGE = "Wroom-wroom! Oil engine started";
    public static final String STOP_MESSAGE = "Oil engine stopped";

    private String oilType;
    private double volume;

    public OilEngine() {
    }
    public OilEngine(int power, int torque, String oilType, double volume) {
        super(power, torque);
        this.oilType = oilType;
        this.volume = volume;
    }
    public OilEngine(OilEngine oilEngine) {
        this(oilEngine.power, oilEngine.torque, oilEngine.oilType, oilEngine.volume);
    }

    //Setters
    public void setOilType(String oilType) {
        this.oilType = oilType;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    //Getters
    public String getOilType() {
        return oilType;
    }
    public double getVolume() {
        return volume;
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

        OilEngine oilEngine = (OilEngine) o;

        if (Double.compare(oilEngine.volume, volume) != 0) return false;
        return oilType != null ? oilType.equals(oilEngine.oilType) : oilEngine.oilType == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (oilType != null ? oilType.hashCode() : 0);
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString() {
        return "OilEngine{" +
                "oilType='" + oilType + '\'' +
                ", volume=" + volume +
                '}';
    }

}
