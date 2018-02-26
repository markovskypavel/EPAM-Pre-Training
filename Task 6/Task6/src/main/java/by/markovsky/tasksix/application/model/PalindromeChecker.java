package by.markovsky.tasksix.application.model;

import by.markovsky.tasksix.data.collection.CustomArrayStack;
import by.markovsky.tasksix.data.collection.CustomListStack;
import by.markovsky.tasksix.data.collection.Stack;
import by.markovsky.tasksix.infrastructure.exception.CustomStackEmptyException;
import by.markovsky.tasksix.infrastructure.exception.CustomStackOverflowException;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class PalindromeChecker {

    /**
     * Returns false if an exception has been thrown in reverseString
     */
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        return word.equals(reverseString(word));
    }
    public static String reverseString(String word) {
        Stack<Character> stack = new CustomArrayStack<>(word.length());
        StringBuilder reversedWord = new StringBuilder();
        try {
            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }
            while (!stack.isEmpty()) {
                reversedWord.append(stack.pop());
            }
            return reversedWord.toString();
        } catch (CustomStackOverflowException | CustomStackEmptyException csoe) {
            csoe.printStackTrace();
            return null;
        }
    }

}
