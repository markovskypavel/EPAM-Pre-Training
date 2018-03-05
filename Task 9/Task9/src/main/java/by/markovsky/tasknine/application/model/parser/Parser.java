package by.markovsky.tasknine.application.model.parser;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public abstract class Parser {

    protected String string;

    public Parser() {
    }
    public Parser(String string) {
        this.string = string;
    }

    //Setters
    public void setString(String string) {
        this.string = string;
    }

    public abstract void parse();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parser parser = (Parser) o;

        return string != null ? string.equals(parser.string) : parser.string == null;
    }
    @Override
    public int hashCode() {
        return string != null ? string.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Parser{" +
                "string='" + string + '\'' +
                '}';
    }

}
