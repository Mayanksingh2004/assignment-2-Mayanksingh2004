/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode root = null;

    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        }
    }
}
