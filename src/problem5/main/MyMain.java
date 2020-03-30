/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of student entries : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Roll number :");
            int roll = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Name : ");
            String name = scanner.nextLine();
            System.out.println("Enter Backlogs : ");
            int backlog = Integer.parseInt(scanner.nextLine());
            int appearingCount = 0;
            boolean response = true;
            while (response) {
                System.out.println("Enter Appearing Count : ");
                appearingCount = Integer.parseInt(scanner.nextLine());
                if (appearingCount < 3) {
                    break;
                }
                System.out.println("Wrong Appearing Count");
            }
            queue.enqueue(new Student(roll, name, backlog, appearingCount));
        }

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
