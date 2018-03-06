package by.markovsky.tasknine.application.model;

import by.markovsky.tasknine.application.model.parser.TextParser;
import by.markovsky.tasknine.domain.entity.Paragraph;
import by.markovsky.tasknine.domain.entity.Sentence;
import by.markovsky.tasknine.domain.entity.SentenceParts;
import by.markovsky.tasknine.domain.entity.Word;

import java.util.*;
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
    private SortedMap<Word, Integer> coutWordRepeats(String... words) {
        SortedMap<Word, Integer> map = new TreeMap<>(new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getWord().compareTo(o2.getWord());
            }
        });
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
            map.put(new Word(word), count);
        }
        return map;
    }
    public String countWordsWithSet(String... words) {
        StringBuilder stringBuilder = new StringBuilder();
        SortedSet<Map.Entry<Word, Integer>> sortedSet = new TreeSet<>(new Comparator<Map.Entry<Word, Integer>>() {
            @Override
            public int compare(Map.Entry<Word, Integer> o1, Map.Entry<Word, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue())>= 0? -1 : 1;
            }
        });
        SortedMap<Word, Integer> map = coutWordRepeats(words);
        sortedSet.addAll(map.entrySet());
        for (Map.Entry e : sortedSet) {
            stringBuilder.append(e.getKey().toString() + " - " + e.getValue() + "\n");
        }
        return stringBuilder.toString();
    }
    public String countWordsWithList(String... words) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<Word, Integer>> list = new ArrayList<>(coutWordRepeats(words).entrySet());
        Comparator<Map.Entry<Word, Integer>> comparator = new Comparator<Map.Entry<Word, Integer>>() {
            @Override
            public int compare(Map.Entry<Word, Integer> o1, Map.Entry<Word, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue()) > 0? -1 :
                        o1.getValue().compareTo(o2.getValue()) < 0? 1 : 0;
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry e : list) {
            stringBuilder.append(e.getKey().toString() + " - " + e.getValue() + "\n");
        }
        return stringBuilder.toString();
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
