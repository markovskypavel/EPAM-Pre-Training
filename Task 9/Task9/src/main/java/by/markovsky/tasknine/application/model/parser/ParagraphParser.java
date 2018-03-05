package by.markovsky.tasknine.application.model.parser;

import by.markovsky.tasknine.domain.entity.Paragraph;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class ParagraphParser extends Parser {

    private Paragraph paragraph;
    private final static String REGEXP = "(?<=[.|?|!])[\\s|\\n]?";

    public ParagraphParser() {
    }
    public ParagraphParser(String paragraph) {
        super(paragraph);
    }

    //Getters
    public Paragraph getParagraph() {
        return paragraph;
    }

    @Override
    public void parse() {
        paragraph = new Paragraph();
        String[] sentences = string.split(REGEXP);
        int length = sentences.length;
        SentenceParser parser = new SentenceParser();
        for (int i = 0; i < length; i++) {
            parser.setString(sentences[i]);
            parser.parse();
            paragraph.addSentence(parser.getSentence());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ParagraphParser that = (ParagraphParser) o;

        return paragraph != null ? paragraph.equals(that.paragraph) : that.paragraph == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (paragraph != null ? paragraph.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return paragraph.toString();
    }

}
