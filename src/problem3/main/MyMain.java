/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.push(181500372, "Loki");
        queue.push(181500348, "Mayank");
        queue.push(181500358, "Halo");
        queue.push(181500399, "Zeus");
        queue.push(181500009, "Atreus");
        queue.push(181500010, "Kratos");
        queue.print();
    }
}
