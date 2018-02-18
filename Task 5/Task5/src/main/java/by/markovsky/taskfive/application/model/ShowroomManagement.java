package by.markovsky.taskfive.application.model;

import by.markovsky.taskfive.domain.entity.showroom.AutoShowroom;

/**
 * Created by Pavel Markovsky on 17.02.2018.
 */
public class ShowroomManagement {

    private AutoShowroom autoShowroom;
    private String director;

    public ShowroomManagement() {
    }
    public ShowroomManagement(AutoShowroom autoShowroom, String director) {
        this.autoShowroom = autoShowroom;
        this.director = director;
    }
    public ShowroomManagement(ShowroomManagement showroomManagement) {
        this(showroomManagement.autoShowroom, showroomManagement.director);
    }

    //Setters
    public void setAutoShowroom(AutoShowroom autoShowroom) {
        this.autoShowroom = autoShowroom;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    //Getters
    public AutoShowroom getAutoShowroom() {
        return autoShowroom;
    }
    public String getDirector() {
        return director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShowroomManagement that = (ShowroomManagement) o;

        if (autoShowroom != null ? !autoShowroom.equals(that.autoShowroom) : that.autoShowroom != null) return false;
        return director != null ? director.equals(that.director) : that.director == null;
    }
    @Override
    public int hashCode() {
        int result = autoShowroom != null ? autoShowroom.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "ShowroomManagement{" +
                "autoShowroom=" + autoShowroom +
                ", director='" + director + '\'' +
                '}';
    }

}
