package by.markovsky.tasknine.application.model;

import by.markovsky.tasknine.application.model.parser.TextParser;
import by.markovsky.tasknine.data.collection.CustomBinaryTree;
import by.markovsky.tasknine.data.collection.CustomTree;
import by.markovsky.tasknine.domain.entity.Paragraph;
import by.markovsky.tasknine.domain.entity.Sentence;
import by.markovsky.tasknine.domain.entity.SentenceParts;
import by.markovsky.tasknine.domain.entity.Word;
import by.markovsky.tasknine.infrastructure.exception.CustomTreeEmptyException;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Pavel Markovsky on 05.03.2018.
 */
public class TextWork {

    private TextParser textParser;

    public TextWork(String text) {
        this.textParser = new TextParser(text);
        textParser.parse();
    }

    //Setters
    public void setText(String text) {
        this.textParser = new TextParser(text);
        textParser.parse();
    }

    //Getters
    public String getText() {
        return textParser.toString();
    }

    //TASK VARIANT 10
    //Sorts words by their repeats
    private CustomTree<Word> getSortedWords(String... words) {
        CustomTree<Word> countingWords = new CustomBinaryTree<>();
        for (String word : words) {
            int count = 0;
            List<Paragraph> paragraphs = textParser.getText().getParagraphs();
            for (Paragraph paragraph : paragraphs) {
                List<Sentence> sentences = paragraph.getSentences();
                for (Sentence sentence : sentences) {
                    List<SentenceParts> sentenceParts = sentence.getSentenceParts();
                    for (SentenceParts sentencePart : sentenceParts) {
                        Pattern p = Pattern.compile("\\b" + word + "\\b");
                        Matcher m = p.matcher(sentencePart.construct());
                        if (m.matches()) {
                            count++;
                        }
                    }
                }
            }
            countingWords.add(new Word(word, count));
        }
        return countingWords;
    }
    public String countWords(String... words) {
        try {
            return getSortedWords(words).inOrder().toString();
        } catch (CustomTreeEmptyException ctee) {
            ctee.printStackTrace();
        }
        return null;
    }

    //TASK VARIANT 12
    //Deleting all words with the first consonant letter and entered length
    public String deleteConsonantWords(int length) {
        return textParser.getText().toString().replaceAll("\\b[\\s][^аАоОиИэЭуУыЫ][а-яёА-яё]{" + (length - 1) + "}[.|?|!]?\\b", "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextWork textWork = (TextWork) o;

        return textParser != null ? textParser.equals(textWork.textParser) : textWork.textParser == null;
    }
    @Override
    public int hashCode() {
        return textParser != null ? textParser.hashCode() : 0;
    }
    @Override
    public String toString() {
        return textParser.toString();
    }

}
