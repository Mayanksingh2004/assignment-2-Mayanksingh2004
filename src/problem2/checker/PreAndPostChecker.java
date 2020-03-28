package problem2.checker;

import problem1.node.TreeNode;

import java.util.LinkedList;

public class PreAndPostChecker {
    LinkedList<TreeNode> preOrderList = new LinkedList<>();
    LinkedList<TreeNode> postOrderList = new LinkedList<>();

    public void preOrder(TreeNode node) {
        preOrderList.add(node);
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void postOrder(TreeNode node) {
        preOrder(node.getRight());
        preOrder(node.getLeft());
        preOrderList.add(node);
    }

}
