/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (temp.getData() >= node.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (parent.getData() >= node.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            traverseInOrder(node.getRight());
        }
    }

    public void printLeftChild(TreeNode node) {
        int counter = 0;
        if (node != null) {
            Queue<TreeNode> queue = new LinkedList();
            queue.add(node);
            System.out.println("Left Childs :");
            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.remove();
                if (currentNode.getLeft() == null) {
                    counter++;
                }
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                    System.out.print(currentNode.getLeft().getData() + " ");
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
            System.out.println("\nNo. of Nodes with no Left Child : " + counter);
        } else {
            throw new NullPointerException();
        }
    }

    public boolean isLeaf(TreeNode node) {
        return node.getLeft() == null && node.getRight() == null;
    }
}
