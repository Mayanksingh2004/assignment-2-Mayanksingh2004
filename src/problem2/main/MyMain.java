/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.LinkedList;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        MyMain myMain = new MyMain();
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
        myMain.listPreOrder(tree.getRoot());
        myMain.listPostOrder(tree.getRoot());
        myMain.checker();
    }

    public void listPreOrder(TreeNode node) {
        if (node != null) {
            list1.add(node.getData());
            listPreOrder(node.getLeft());
            listPreOrder(node.getRight());
        }
    }

    public void listPostOrder(TreeNode node) {
        if (node != null) {
            listPostOrder(node.getRight());
            listPostOrder(node.getLeft());
            list2.add(node.getData());
        }


    }

    public void checker() {
        if (list1.get(0) == list2.get(list2.size() - 1)) {
            System.out.println("First element of the preOrder and Last element of PostOrder are same(Root Node).");
        }
        int midOfPreOrder = (list1.size() - 1) / 2;
        int midOfPostOrder = (list2.size() - 1) / 2;

        if (list1.get(midOfPreOrder) == list2.get(midOfPostOrder)) {
            System.out.println("They have common mid point, i.e. both the traversal will give same element at the mid position for odd number of nodes.");
        }
    }
}
