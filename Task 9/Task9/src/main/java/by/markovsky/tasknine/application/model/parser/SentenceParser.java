package by.markovsky.tasknine.application.model.parser;

import by.markovsky.tasknine.domain.entity.Mark;
import by.markovsky.tasknine.domain.entity.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class SentenceParser extends Parser {

    private Sentence sentence;
    private final static String COMPONENT_SPLITTER = "[\\s]+";
    private final static String WORD_REGEXP = "[а-яёА-ЯЁ][а-яёА-ЯЁ_-]*";
    private final static String MARK_REGEXP = "[.|?|!]+";

    public SentenceParser() {
    }
    public SentenceParser(String sentence) {
        super(sentence);
    }

    //Getters
    public Sentence getSentence() {
        return sentence;
    }

    @Override
    public void parse() {
        sentence = new Sentence();
        String[] components = string.split(COMPONENT_SPLITTER);
        WordParser lp = new WordParser();
        Pattern wordPattern = Pattern.compile(WORD_REGEXP);
        Pattern markPattern = Pattern.compile(MARK_REGEXP);
        for(String component : components){
            Matcher wordMatcher = wordPattern.matcher(component);
            Matcher markMatcher = markPattern.matcher(component);
            while(wordMatcher.find()){
                lp.setString(wordMatcher.group());
                lp.parse();
                sentence.addPart(lp.getWord());
            }
            while(markMatcher.find()){
                sentence.addPart(new Mark(markMatcher.group()));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SentenceParser that = (SentenceParser) o;

        return sentence != null ? sentence.equals(that.sentence) : that.sentence == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return sentence.toString();
    }

}
