package by.markovsky.tasknine.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class Sentence {

    private List<SentenceParts> sentenceParts;
    private String sentence;

    public Sentence() {
        sentenceParts = new ArrayList<>();
    }
    public Sentence(String sentence) {
        this.sentenceParts = new ArrayList<>();
        this.sentence = sentence;
    }
    public Sentence(List<SentenceParts> sentenceParts) {
        this.sentenceParts = sentenceParts;
        constructSentence();
    }

    //Setters
    public void setSentenceParts(List<SentenceParts> sentenceParts) {
        this.sentenceParts = sentenceParts;
        constructSentence();
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    //Getters
    public List<SentenceParts> getSentenceParts() {
        return sentenceParts;
    }
    public String getSentence() {
        return sentence;
    }

    public void addPart(SentenceParts sentenceParts){
        this.sentenceParts.add(sentenceParts);
    }
    public String constructSentence() {
        StringBuilder stringBuilder = new StringBuilder();
        for (SentenceParts part : sentenceParts) {
            stringBuilder.append(part instanceof Word ? (part.construct() + " ") : part.construct());
        }
        this.sentence = stringBuilder.toString();
        return sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence1 = (Sentence) o;

        if (sentenceParts != null ? !sentenceParts.equals(sentence1.sentenceParts) : sentence1.sentenceParts != null)
            return false;
        return sentence != null ? sentence.equals(sentence1.sentence) : sentence1.sentence == null;
    }
    @Override
    public int hashCode() {
        int result = sentenceParts != null ? sentenceParts.hashCode() : 0;
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return sentence;
    }

}
