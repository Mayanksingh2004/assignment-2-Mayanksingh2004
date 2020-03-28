/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node head = null;

    public void push(int rollNumber, String name) {
        Node node = new Node(rollNumber, name);
        if (head == null) {
            head = node;
        } else {
            if (head.getRollNumber() > node.getRollNumber()) {
                node.setNext(head);
                head = node;
            } else {
                Node temp = head;
                Node previous = null;
                while (temp != null) {
                    previous = temp;
                    if (temp.getRollNumber() < node.getRollNumber()) {
                        temp = temp.getNext();
                    } else {
                        previous.setNext(node);
                        node.setNext(temp);
                    }
                }
            }
        }
    }
}
