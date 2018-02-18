package by.markovsky.taskfive.domain.entity.car;

/**
 * Created by Pavel Markovsky on 18.02.2018.
 */
public abstract class Engine implements Startable {

    protected int power;
    protected int torque;

    public Engine() {
    }
    public Engine(int power, int torque) {
        this.power = power;
        this.torque = torque;
    }

    //Setters
    public void setPower(int power) {
        this.power = power;
    }
    public void setTorque(int torque) {
        this.torque = torque;
    }

    //Getters
    public int getPower() {
        return power;
    }
    public int getTorque() {
        return torque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return torque == engine.torque;
    }
    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + torque;
        return result;
    }
    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                '}';
    }

}
