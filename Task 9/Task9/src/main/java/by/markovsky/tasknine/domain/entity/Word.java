package by.markovsky.tasknine.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class Word extends SentenceParts {

    private List<Letter> letters;
    private String word;

    public Word() {
        this.letters = new ArrayList<>();
    }
    public Word(String word) {
        this.letters = new ArrayList<>();
        this.word = word;
    }
    public Word(List<Letter> letters) {
        this.letters = letters;
        construct();
    }
    public Word(Word word) {
        this(word.word);
    }

    public void addLetter(Letter letter){
        letters.add(letter);
    }

    //Setters
    public void setLetters(List<Letter> letters) {
        this.letters = letters;
        construct();
    }
    public void setWord(String word) {
        this.word = word;
        this.letters = new ArrayList<>();
    }

    //Getters
    public List<Letter> getLetters() {
        return letters;
    }
    public String getWord() {
        return word;
    }

    @Override
    public String construct() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Letter letter : letters){
            stringBuilder.append(letter);
        }
        this.word = stringBuilder.toString();
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        if (letters != null ? !letters.equals(word1.letters) : word1.letters != null) return false;
        return word != null ? word.equals(word1.word) : word1.word == null;
    }
    @Override
    public int hashCode() {
        int result = letters != null ? letters.hashCode() : 0;
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return word;
    }

}
