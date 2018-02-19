package by.markovsky.taskfive.domain.entity.showroom;

import by.markovsky.taskfive.data.container.CustomArrayList;
import by.markovsky.taskfive.domain.entity.car.Automobile;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class AutoShowroom {

    private CustomArrayList<Automobile> automobiles;
    private String name;

    public AutoShowroom() {
        this.automobiles = new CustomArrayList<>();
    }
    public AutoShowroom(String name) {
        this.automobiles = new CustomArrayList<>();
        this.name = name;
    }
    public AutoShowroom(AutoShowroom autoShowroom) {
        this.automobiles = new CustomArrayList<>(autoShowroom.getAutomobiles());
        this.name = autoShowroom.name;
    }

    //Setters
    public void setAutomobiles(CustomArrayList<Automobile> automobiles) {
        this.automobiles = automobiles;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getters
    public CustomArrayList<Automobile> getAutomobiles() {
        return automobiles;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoShowroom that = (AutoShowroom) o;

        if (automobiles != null ? !automobiles.equals(that.automobiles) : that.automobiles != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }
    @Override
    public int hashCode() {
        int result = automobiles != null ? automobiles.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "AutoShowroom{" +
                "automobiles=" + automobiles +
                ", name='" + name + '\'' +
                '}';
    }

}
