package by.markovsky.taskseven.presentation.controller;

import by.markovsky.taskseven.data.collection.CustomBinaryTree;
import by.markovsky.taskseven.data.collection.CustomTree;

/**
 * Created by Pavel Markovsky on 23.02.2018.
 */
public class CollectionController {

    public static void main(String[] args) {
        CustomTree<Integer> tree = new CustomBinaryTree<>(8, 3, 10, 1, 6, 14, 4, 7, 13);
        System.out.println(tree.preOrder());
        System.out.println(tree.postOrder());
        System.out.println(tree.inOrder());
    }

}
