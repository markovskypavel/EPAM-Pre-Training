package by.markovsky.tasknine.application.model.parser;

import by.markovsky.tasknine.domain.entity.Letter;
import by.markovsky.tasknine.domain.entity.Word;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class WordParser extends Parser {

    private Word word;

    public WordParser() {
    }
    public WordParser(String word) {
        super(word);
    }

    //Getters
    public Word getWord() {
        return word;
    }

    @Override
    public void parse() {
        word = new Word(string);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            word.addLetter(new Letter(string.substring(i, i + 1)));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WordParser that = (WordParser) o;

        return word != null ? word.equals(that.word) : that.word == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return word.toString();
    }

}
