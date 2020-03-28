package problem3.student;

public class Student {

    private long rollNumber;
    private String name;

    public Student(long rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
