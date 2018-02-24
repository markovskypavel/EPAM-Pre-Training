package by.markovsky.tasksix.presentation.controller;

import by.markovsky.tasksix.application.model.PalindromeChecker;
import by.markovsky.tasksix.view.View;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CollectionController {

    public static void main(String[] args) {
        String word1 = "Palindrome";
        String word2 = "LoL";
        View.print(word1 + " - " + (PalindromeChecker.isPalindrome(word1) ? "is palindrome" : "isn't palindrome"));
        View.print(word2 + " - " + (PalindromeChecker.isPalindrome(word2) ? "is palindrome" : "isn't palindrome"));
    }

}
