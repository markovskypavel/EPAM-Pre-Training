package by.markovsky.taskeight.domain.entity.car;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public abstract class Automobile implements Moveable, Comparable<Automobile> {

    protected String model;
    protected String color;
    protected int price;

    protected Chassis chassis;
    protected Engine engine;
    protected Startable starter; //Interface for engine

    public Automobile() {
        this.chassis = new Chassis();
    }
    public Automobile(String model, String color, int price, int wheelQuantity, int length) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.chassis = new Chassis(wheelQuantity, length);
    }

    //Setters
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
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
    public int getPrice() {
        return price;
    }
    public Chassis getChassis() {
        return chassis;
    }
    public Engine getEngine() {
        return engine;
    }

    @Override
    public int compareTo(Automobile o) {
        return this.model.compareTo(o.model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Automobile that = (Automobile) o;

        if (price != that.price) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (chassis != null ? !chassis.equals(that.chassis) : that.chassis != null) return false;
        return engine != null ? engine.equals(that.engine) : that.engine == null;
    }
    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (chassis != null ? chassis.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Automobile{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", chassis=" + chassis +
                ", engine=" + engine +
                '}';
    }

}
