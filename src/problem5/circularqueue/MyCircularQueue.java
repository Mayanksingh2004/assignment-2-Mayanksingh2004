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
    private int size;

    public MyCircularQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(Student data) {
        Node node = new Node<>(data);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        size++;
        rear.setNext(front);
    }

    public void dequeue() {
        boolean response = true;
        int counter = 0;
        while (response && counter < size) {
            if (front.getData().getBacklog() == 0) {
                System.out.println(front.getData() + "\nThis Student is Removed.");
                delete();
                return;
            } else {
                front.getData().setBacklog(front.getData().getBacklog() - front.getData().getAppearingCount());
                System.out.println("\n" + front.getData().getBacklog());
                rear.setNext(front);
                rear = front;
                front = front.getNext();
                counter++;
            }
        }
        System.out.println("No Student to Remove.");
    }

    private void delete() {
        if (size > 1) {
            front = front.getNext();
            rear.setNext(front);
            size--;
        } else if (size == 1) {
            System.out.println(front.getData());
            front = null;
            rear = null;
            size--;
        } else {
            System.out.println("UnderFlow");
        }
    }

    public void peek() {
        System.out.println(front.getData());
    }
}
