/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem3.student.Student;


public class MyPriorityQueue<E> {
    private Node<Student> front = null;

    public void enqueue(Student data) {
        Node<Student> node = new Node<>(data);
        if (front == null) {
            front = node;
        } else if (front.getData().getRollNumber() == node.getData().getRollNumber()) {
            System.out.println("Duplicate Entry");
        } else {
            if (front.getData().getRollNumber() > node.getData().getRollNumber()) {
                node.setNext(front);
                front = node;
            } else {
                Node<Student> temp = front;
                Node previous = null;
                while (temp != null && temp.getData().getRollNumber() < node.getData().getRollNumber()) {
                    previous = temp;
                    if (temp.getData().getRollNumber() < node.getData().getRollNumber()) {
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
        System.out.println(front.getData().getRollNumber() + "  " + front.getData().getName());
    }

    public void dequeue() {
        System.out.println(front.getData().getRollNumber() + "  " + front.getData().getName());
        front = front.getNext();
    }
}
