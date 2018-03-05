package by.markovsky.tasknine.application.model.parser;

import by.markovsky.tasknine.domain.entity.Text;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class TextParser extends Parser {

    private Text text;
    private final static String REGEXP = "(\\n)";

    public TextParser() {
    }
    public TextParser(String text) {
        super(text);
    }

    //Getters
    public Text getText() {
        return text;
    }

    @Override
    public void parse() {
        text = new Text(string);
        String s = string.toString();
        String[] paragraphs = s.split(REGEXP);
        ParagraphParser parser = new ParagraphParser();
        int length = paragraphs.length;
        for (int i = 0; i < length; i++) {
            parser.setString(paragraphs[i]);
            parser.parse();
            text.addParagraph(parser.getParagraph());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TextParser that = (TextParser) o;

        return text != null ? text.equals(that.text) : that.text == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return text.toString();
    }

}
