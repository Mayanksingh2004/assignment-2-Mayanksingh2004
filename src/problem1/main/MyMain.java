/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(25);
//        tree.insert(75);
//        tree.insert(15);
//        tree.insert(35);
//        tree.insert(65);
//        tree.insert(80);
//        tree.insert(158);
//        tree.insert(456);
        tree.traverseInOrder(tree.getRoot());
    }
}
