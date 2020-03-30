/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {

    private Node<Student> front;
    private Node<Student> rear;

    public void enqueue(Student data) {
        Node node = new Node<>(data);
        if (front == null) {
            front = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        rear.setNext(front);
    }
}
