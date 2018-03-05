package by.markovsky.tasknine.domain.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class Text {

    private List<Paragraph> paragraphs;
    private String text;

    public Text() {
        this.paragraphs = new ArrayList<>();
    }
    public Text(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
        constructText();
    }
    public Text(String text) {
        this.paragraphs = new ArrayList<>();
        this.text = text;
    }

    //Setters
    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
        constructText();
    }
    public void setText(String text) {
        this.text = text;
    }

    //Getters
    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }
    public String getText() {
        return text;
    }

    public void addParagraph(Paragraph paragraph){
        paragraphs.add(paragraph);
    }
    public String constructText(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Paragraph paragraph : paragraphs){
            stringBuilder.append(paragraph.constructParagraph());
        }
        this.text = stringBuilder.toString();
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text1 = (Text) o;

        if (paragraphs != null ? !paragraphs.equals(text1.paragraphs) : text1.paragraphs != null) return false;
        return text != null ? text.equals(text1.text) : text1.text == null;
    }
    @Override
    public int hashCode() {
        int result = paragraphs != null ? paragraphs.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return text;
    }

}
