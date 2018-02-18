package by.markovsky.taskfive.domain.enumeration;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public enum ShiftBoxType {

    ASGB("Automatic"), MSGB("Mechanic"), RSGB("Robotic");

    private String type;

    ShiftBoxType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
