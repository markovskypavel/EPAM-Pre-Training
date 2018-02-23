package by.markovsky.tasksix.application.model;

import by.markovsky.tasksix.data.collection.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String word, Stack<Character> stack){
        StringBuilder reversedWord = new StringBuilder();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()){
            reversedWord.append(stack.pop());
        }
        return word.equals(reversedWord.toString());
    }

}
