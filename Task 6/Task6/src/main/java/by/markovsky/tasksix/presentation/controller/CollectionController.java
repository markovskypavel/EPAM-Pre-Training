package by.markovsky.tasksix.presentation.controller;

import by.markovsky.tasksix.application.model.PalindromeChecker;
import by.markovsky.tasksix.data.collection.ArrayStack;
import by.markovsky.tasksix.data.collection.Stack;
import by.markovsky.tasksix.view.View;

import java.util.Iterator;

public class CollectionController {

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(1,2,3,4,5);
        View.print(stack);
        stack.push(6);
        View.print(stack);
        stack.pop();
        View.print(stack);

        for(Iterator<Integer> it = stack.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        stack.clear();
        View.print(stack);

        String word = "Аоол";
        View.print(word + " - " + (PalindromeChecker.isPalindrome(word, new ArrayStack<>()) ? "is palindrome" : "isn't palindrome"));
    }

}
