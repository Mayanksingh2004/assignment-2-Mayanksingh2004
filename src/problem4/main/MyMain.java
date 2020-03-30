/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;


// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    static MyQueue<TreeNode> queue = new MyQueue();
    static MyBinarySearchTree tree = new MyBinarySearchTree();

    public static void main(String[] args) {
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(15);
        tree.insert(35);
        tree.insert(65);
        tree.insert(80);
        tree.insert(7);
        tree.insert(32);
        tree.insert(31);
        tree.insert(33);
        tree.insert(67);
        tree.insert(90);
        tree.insert(82);
        tree.insert(93);
        tree.traversePreOrder(tree.getRoot());
        System.out.println();
        preOrderQueue(tree.getRoot());

    }

    public static void preOrderQueue(TreeNode node) {
        if (node != null) {
            if (tree.preOrderSuccessor(node) != null) {
                queue.enqueue(tree.preOrderSuccessor(node));
                System.out.println("PreOrder Successor of " + node.getData() + " is : " + tree.preOrderSuccessor(node).getData());
            }
            preOrderQueue(node.getLeft());
            preOrderQueue(node.getRight());
        }
    }
}
