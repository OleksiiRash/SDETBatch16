package class15.homework_class15;

public class Students {

/*
Task:
Create a Class called Students
Create three variables  Name, ID  and numberOfStudents
Create three objects of the Students Class
Set the value for studentName, studentID and increment the numberOfStudents for each object
Print out  total number of students
*/

    String name;
    String id;
    static int NUMBER_OF_STUDENTS;

    public static void main(String[] args) {

        Students class1 = new Students();
        class1.name = "Mark";
        class1.id = "1245789";
        NUMBER_OF_STUDENTS++;

        Students class2 = new Students();
        class2.name = "Kevin";
        class2.id = "4784512";
        NUMBER_OF_STUDENTS++;

        Students class3 = new Students();
        class3.name = "Oleksii";
        class3.id = "7455555";
        NUMBER_OF_STUDENTS++;

        System.out.println("Total Number of Students: " + Students.NUMBER_OF_STUDENTS);

    }
}
