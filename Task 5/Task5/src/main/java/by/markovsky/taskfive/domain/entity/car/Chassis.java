package by.markovsky.taskfive.domain.entity.car;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class Chassis {

    private int wheelQuantity;
    private int length;

    public Chassis() {
    }
    public Chassis(int wheelQuantity, int length) {
        this.wheelQuantity = wheelQuantity;
        this.length = length;
    }
    public Chassis(Chassis chassis) {
        this(chassis.wheelQuantity, chassis.length);
    }

    //Setters
    public void setWheelQuantity(int wheelQuantity) {
        this.wheelQuantity = wheelQuantity;
    }
    public void setLength(int length) {
        this.length = length;
    }

    //Getters
    public int getWheelQuantity() {
        return wheelQuantity;
    }
    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chassis chassis = (Chassis) o;

        if (wheelQuantity != chassis.wheelQuantity) return false;
        return length == chassis.length;
    }
    @Override
    public int hashCode() {
        int result = wheelQuantity;
        result = 31 * result + length;
        return result;
    }
    @Override
    public String toString() {
        return "Chassis{" +
                "wheelQuantity=" + wheelQuantity +
                ", length=" + length +
                '}';
    }

}
