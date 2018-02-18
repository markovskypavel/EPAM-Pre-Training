package by.markovsky.taskfive.domain.entity.car;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class ShiftBox {

    private String shiftType;
    private int gears;

    public ShiftBox() {
    }
    public ShiftBox(String shiftType, int gears) {
        this.shiftType = shiftType;
        this.gears = gears;
    }
    public ShiftBox(ShiftBox shiftBox) {
        this(shiftBox.shiftType, shiftBox.gears);
    }

    //Setters
    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }

    //Getters
    public String getShiftType() {
        return shiftType;
    }
    public int getGears() {
        return gears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShiftBox shiftBox = (ShiftBox) o;

        if (gears != shiftBox.gears) return false;
        return shiftType != null ? shiftType.equals(shiftBox.shiftType) : shiftBox.shiftType == null;
    }
    @Override
    public int hashCode() {
        int result = shiftType != null ? shiftType.hashCode() : 0;
        result = 31 * result + gears;
        return result;
    }
    @Override
    public String toString() {
        return "ShiftBox{" +
                "shiftType='" + shiftType + '\'' +
                ", gears=" + gears +
                '}';
    }

}
