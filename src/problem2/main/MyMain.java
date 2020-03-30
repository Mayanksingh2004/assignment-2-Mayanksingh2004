/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem2.checker.Checker;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {

    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Checker checker = new Checker();
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
        checker.listPreOrder(tree.getRoot());
        checker.listPostOrder(tree.getRoot());
        checker.checker();
    }


}
