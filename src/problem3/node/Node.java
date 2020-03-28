/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {

    private Node next = null;
    private int rollNumber = 0;
    private String name = "Unnamed";

    public Node(int rollNumber, String name) {
        this.next = null;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}
