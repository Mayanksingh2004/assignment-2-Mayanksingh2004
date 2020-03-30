/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem3.node.Node;

public class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;

    public void enqueue(E data) {
        Node node = new Node<>(data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println(front.getData() + " is deleted.");
            front = front.getNext();
        } else {
            System.out.println("Underflow.");
        }
    }

    public boolean isEmpty() {
        boolean response = false;
        if (front == null) {
            response = true;
        }
        return response;
    }
}