package by.markovsky.tasknine.presentation.controller;

import by.markovsky.tasknine.application.model.TextWork;
import by.markovsky.tasknine.application.model.util.FileWork;
import by.markovsky.tasknine.infrastructure.exception.CustomTreeEmptyException;
import by.markovsky.tasknine.view.View;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class Controller {

    public static void main(String[] args) throws CustomTreeEmptyException {
        int length = 14;
        String word1 = "промышленности";
        String word2 = "отрасли";
        TextWork textWork = new TextWork(FileWork.readTextFromFile("text.txt"));
        View.print("===ИСХОДНЫЙ ТЕКСТ ИЗ ФАЙЛА===\n" + textWork.getText());
        View.print("===ПОВТОРЕНИЯ СЛОВ \"" + word1 + "\" И \"" + word2 + "\"===\n" + textWork.countWords(word1, word2));
        View.print("===ТЕКСТ БЕЗ СЛОВ С ПЕРВЫМИ СОГЛАСНЫМИ ДЛИНЫ " + length + "===\n" + textWork.deleteConsonantWords(14));
    }

}
