package class25.homework;

import java.util.Arrays;
import java.util.HashSet;

public class Task3_Student {

    private String name;
    private String studentID;

    public Task3_Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }
}

class StudentTester {
    public static void main(String[] args) {

        HashSet<Task3_Student> students = new HashSet<>();
        students.addAll(Arrays.asList(new Task3_Student("Alex", "112a"), new Task3_Student("Mark", "145d"), new Task3_Student("Kevin", "3145f")));
        for (Task3_Student s : students){
            System.out.println(s.getName() + " " + s.getStudentID());
        }

    }
}
