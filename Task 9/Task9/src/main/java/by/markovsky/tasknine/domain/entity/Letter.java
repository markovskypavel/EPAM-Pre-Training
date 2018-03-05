package by.markovsky.tasknine.domain.entity;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class Letter {

    private String letter;

    public Letter() {
    }
    public Letter(String letter) {
        this.letter = letter;
    }

    //Setters
    public void setLetter(String letter) {
        this.letter = letter;
    }

    //Getters
    public String getLetter() {
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter1 = (Letter) o;

        return letter != null ? letter.equals(letter1.letter) : letter1.letter == null;
    }
    @Override
    public int hashCode() {
        return letter != null ? letter.hashCode() : 0;
    }
    @Override
    public String toString() {
        return letter;
    }

}
