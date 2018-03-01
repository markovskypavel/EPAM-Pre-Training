package by.markovsky.taskseven.data.collection;

import java.util.Iterator;

/**
 * Created by Pavel Markovsky on 01.03.2018.
 */
public class CustomBinaryTree<E extends Comparable<? super E>>
        extends CustomAbstractCollection<E> implements CustomTree<E>{

    private class Node{

        private E element;
        private Node left;
        private Node right;

        public Node(E element){
            this.element = element;
            this.left = null;
            this.right = null;
        }

        public E getElement(){
            return element;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            if (element != null ? !element.equals(node.element) : node.element != null) return false;
            if (left != null ? !left.equals(node.left) : node.left != null) return false;
            return right != null ? right.equals(node.right) : node.right == null;
        }
        @Override
        public int hashCode() {
            int result = element != null ? element.hashCode() : 0;
            result = 31 * result + (left != null ? left.hashCode() : 0);
            result = 31 * result + (right != null ? right.hashCode() : 0);
            return result;
        }
        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }

    }

    private Node root;

    public CustomBinaryTree() {
        this.root = null;
        this.size = EMPTY_SIZE;
    }
    @SuppressWarnings("unchecked")
    public CustomBinaryTree(E... element) {
        for (int i = 0; i < element.length; i++) {
            add(element[i]);
        }
    }
    public CustomBinaryTree(CustomBinaryTree<E> customBinaryTree) {
        this(customBinaryTree.toArray());
    }
    public CustomBinaryTree(CustomTree<E> customTree) {
        this(customTree.toArray());
    }

    @Override
    public void add(E element) {
        root = addRecursion(root, element);
        ++size;
    }
    private Node addRecursion(Node node, E element){
        if (node == null) {
            return new Node(element);
        } else if (element.compareTo(node.element) < 0) {
            node.left = addRecursion(node.left, element);
        } else {
            node.right = addRecursion(node.right, element);
        }
        return node;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public void clear() {
        this.root = null;
        this.size = EMPTY_SIZE;
    }

    @Override
    public boolean remove(E element) {
        return true;
    }

    @Override
    public E[] toArray() {
        return null;
    }

    @Override
    public StringBuilder preOrder() {
        return preOrderRecursion(root, new StringBuilder());
    }
    private StringBuilder preOrderRecursion(Node node, StringBuilder stringBuilder){
        if(node != null){
            stringBuilder.append(node.element + " ");
            preOrderRecursion(node.left, stringBuilder);
            preOrderRecursion(node.right, stringBuilder);
        }
        return stringBuilder;
    }

    @Override
    public StringBuilder postOrder() {
        return postOrderRecursion(root, new StringBuilder());
    }
    private StringBuilder postOrderRecursion(Node node, StringBuilder stringBuilder){
        if(node != null){
            postOrderRecursion(node.left, stringBuilder);
            postOrderRecursion(node.right, stringBuilder);
            stringBuilder.append(node.element + " ");
        }
        return stringBuilder;
    }

    @Override
    public StringBuilder inOrder() {
        return inOrderRecursion(root, new StringBuilder());
    }
    private StringBuilder inOrderRecursion(Node node, StringBuilder stringBuilder){
        if(node != null){
            inOrderRecursion(node.left, stringBuilder);
            stringBuilder.append(node.element + " ");
            inOrderRecursion(node.right, stringBuilder);
        }
        return stringBuilder;
    }

    @Override
    public Iterator<E> iterator() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomBinaryTree<?> that = (CustomBinaryTree<?>) o;

        return root != null ? root.equals(that.root) : that.root == null;
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (root != null ? root.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "CustomBinaryTree{" +
                "root=" + root +
                "size=" + size +
                '}';
    }

}
