package by.markovsky.tasknine.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class Paragraph {

    private List<Sentence> sentences;
    private String paragraph;

    public Paragraph() {
        this.sentences = new ArrayList<>();
    }
    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
        constructParagraph();
    }
    public Paragraph(String paragraph) {
        this.sentences = new ArrayList<>();
        this.paragraph = paragraph;
    }

    //Setters
    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
        constructParagraph();
    }
    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    //Getters
    public List<Sentence> getSentences() {
        return sentences;
    }
    public String getParagraph() {
        return paragraph;
    }

    public void addSentence(Sentence sentence){
        sentences.add(sentence);
    }
    public String constructParagraph(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Sentence sentence : sentences){
            stringBuilder.append(sentence.constructSentence());
        }
        this.paragraph = stringBuilder.toString();
        return paragraph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paragraph paragraph1 = (Paragraph) o;

        if (sentences != null ? !sentences.equals(paragraph1.sentences) : paragraph1.sentences != null) return false;
        return paragraph != null ? paragraph.equals(paragraph1.paragraph) : paragraph1.paragraph == null;
    }
    @Override
    public int hashCode() {
        int result = sentences != null ? sentences.hashCode() : 0;
        result = 31 * result + (paragraph != null ? paragraph.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return paragraph;
    }

}
