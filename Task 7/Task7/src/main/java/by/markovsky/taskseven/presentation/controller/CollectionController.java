package by.markovsky.taskseven.presentation.controller;

import by.markovsky.taskseven.data.collection.CustomBinaryTree;
import by.markovsky.taskseven.data.collection.CustomTree;
import by.markovsky.taskseven.infrastructure.exception.CustomTreeEmptyException;
import by.markovsky.taskseven.view.View;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CollectionController {

    public static void main(String[] args) {
        CustomTree<Integer> tree = new CustomBinaryTree<>(8, 3, 10, 1, 6, 14, 4, 7, 13);
        int removingNum = 10;
        try {
            View.print("Pre-order: " + tree.preOrder());
            View.print("Post-order: " + tree.postOrder());
            View.print("Does tree contain 11? " + (tree.contains(11) ? "Yes" : "No"));
            tree.remove(removingNum);
            View.print("In-order after removing " + removingNum + ": " + tree.inOrder());
        } catch (CustomTreeEmptyException e) {
            e.printStackTrace();
        }
    }

}
