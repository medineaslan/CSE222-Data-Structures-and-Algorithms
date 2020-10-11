import java.io.Serializable;
import java.util.Scanner;

/**
 * Class for a binary tree that stores type E objects.
 * @param <E> type E.
 */
public class BinaryTree<E> implements Serializable {

    /**
     * The root of the binary tree.
     */
    protected Node<E> root;

    /**
     *  Class to encapsulate a tree node.
     * @param <E> type E.
     */
    protected static class Node<E> implements Serializable {

        /**
         * The information stored in this node.
         */
        protected E data;

        /**
         *  Reference to the left child
         */
        protected Node<E> left;

        /**
         *  Reference to the right child
         */
        protected Node<E> right;

        /**
         * Construct a node with given data and no children.
         * @param data The data to store in this node
         */
        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }

        /**
         * Return a string representation of the node.
         * @return  A string representation of the data fields
         */
        public String toString () {
            return data.toString();
        }
    }

    /**
     * No parameter constructor.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Constructor.
     * @param root initialize root.
     */
    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Constructs a new binary tree with data in its root leftTree as its left subtree and rightTree as its right subtree.
     * @param data initalize data.
     * @param leftTree initialize leftTree.
     * @param rightTree initialize rightTree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {

        root = new Node<>(data);
        if (leftTree != null) {
            root.left = leftTree.root;
        } else {
            root.left = null;
        }
        if (rightTree != null) {
            root.right = rightTree.root;
        }
        else {
            root.right = null;
        }
    }

    /**
     * Return the left subtree
     * @return  The left subtree or null if either the root or the left subtree is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.left != null) {
            return new BinaryTree<>(root.left);
        } else {
            return null;
        }
    }

    /**
     * Return the right subtree
     * @return The right subtree or null if either the root or the right subtree is null
     */

    public BinaryTree<E> getRightSubtree() {
        if (root != null && root.right != null) {
            return new BinaryTree<>(root.right);
        } else {
            return null;
        }
    }

    /**
     *  Determine whether this tree is a leaf.
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        return (root.left == null && root.right == null);
    }

    /**
     *toString method.
     * @return string.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(root, 1, sb);
        return sb.toString();
    }

    /**
     * Converts a subtree to a string.
     * Performs a preorder traversal.
     * @param node node The local root.
     * @param depth depth The depth.
     * @param sb  sb The StringBuilder to save the output.
     */
    private void toString(Node<E> node, int depth, StringBuilder sb) {

        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.toString());
            sb.append("\n");
            toString(node.left, depth + 1, sb);
            toString(node.right, depth + 1, sb);
        }
    }

    /**
     * Method to read a binary tree.
     * @param scan the Scanner attached to the input file.
     * @return  The binary tree.
     */
    public static BinaryTree<String> readBinaryTree(Scanner scan) {

        String data = scan.nextLine().trim();

        if (data.equals("null")) {
            return null;
        }else {
            BinaryTree<String> leftTree = readBinaryTree(scan);
            BinaryTree<String> rightTree = readBinaryTree(scan);
            return new BinaryTree<>(data, leftTree, rightTree);
        }
    }

}
