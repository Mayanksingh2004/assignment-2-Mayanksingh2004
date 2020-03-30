package problem2.checker;

import problem1.node.TreeNode;

import java.util.LinkedList;

public class Checker {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();

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
