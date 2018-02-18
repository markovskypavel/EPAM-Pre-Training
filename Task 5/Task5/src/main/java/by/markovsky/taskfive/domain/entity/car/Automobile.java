package by.markovsky.taskfive.domain.entity.car;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public abstract class Automobile implements Moveable {

    protected String model;
    protected String color;
    protected int seats;

    protected Chassis chassis;

    public Automobile() {
        this.chassis = new Chassis();
    }
    public Automobile(String model, String color, int seats, int wheelQuantity, int length) {
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.chassis = new Chassis(wheelQuantity, length);
    }

    //Setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    //Getters
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getSeats() {
        return seats;
    }
    public Chassis getChassis() {
        return chassis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Automobile that = (Automobile) o;

        if (seats != that.seats) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return chassis != null ? chassis.equals(that.chassis) : that.chassis == null;
    }
    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + seats;
        result = 31 * result + (chassis != null ? chassis.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Automobile{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", chassis=" + chassis +
                '}';
    }

}
