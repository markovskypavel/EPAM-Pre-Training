package by.markovsky.tasknine.domain.entity;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class Mark extends SentenceParts {

    private String mark;

    public Mark() {
    }
    public Mark(String mark) {
        this.mark = mark;
    }

    //Setters
    public void setMark(String mark) {
        this.mark = mark;
    }

    //Getters
    public String getMark() {
        return mark;
    }

    @Override
    public String construct() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mark mark1 = (Mark) o;

        return mark != null ? mark.equals(mark1.mark) : mark1.mark == null;
    }
    @Override
    public int hashCode() {
        return mark != null ? mark.hashCode() : 0;
    }
    @Override
    public String toString() {
        return mark;
    }

}
