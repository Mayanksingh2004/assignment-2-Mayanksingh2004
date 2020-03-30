/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

// TreeNode class implemented using nodes.
public class TreeNode {
    // These are fields of Tree
    private TreeNode left;
    private TreeNode right;
    private int data;

    //Constructor to initialize the fields
    public TreeNode(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    //getter method for left child
    public TreeNode getLeft() {
        return left;
    }

    //setter method for Left child
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    //getter method for Right child
    public TreeNode getRight() {
        return right;
    }

    //setter method for Right child
    public void setRight(TreeNode right) {
        this.right = right;
    }

    //getter method for data field
    public int getData() {
        return data;
    }

    //setter method for data field
    public void setData(int data) {
        this.data = data;
    }
}
