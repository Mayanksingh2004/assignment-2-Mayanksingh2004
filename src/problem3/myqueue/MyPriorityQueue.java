/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node front = null;

    public void push(int rollNumber, String name) {
        Node node = new Node(rollNumber, name);
        if (front == null) {
            front = node;
        } else {
            if (front.getRollNumber() > node.getRollNumber()) {
                node.setNext(front);
                front = node;
            } else {
                Node temp = front;
                Node previous = null;
                while (temp != null && temp.getRollNumber() < node.getRollNumber()) {
                    previous = temp;
                    if (temp.getRollNumber() < node.getRollNumber()) {
                        temp = temp.getNext();
                    }
                }
                previous.setNext(node);
                if (temp != null) {
                    node.setNext(temp);
                }
            }
        }
    }

    public void peek() {
        System.out.println(front.getRollNumber() + "  " + front.getName());
    }
}
