package class17.homework_class17;

public class Students {

/*
Task1:
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each student's name.
*/

    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public Students(String name, int grade1, int grade2, int grade3) {

        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void printStudentInfo(){
        int averageGrade = (grade1 + grade2 + grade3) / 3;
        System.out.println("Student " + name + ": the average grade is " + averageGrade);
    }

    public static void main(String[] args) {

        Students student1 = new Students("Oleksii", 90, 95, 98);
        student1.printStudentInfo();
        Students student2 = new Students("Mark", 85, 72, 65);
        student2.printStudentInfo();
        Students student3 = new Students("Kevin", 97, 82, 63);
        student3.printStudentInfo();
        Students student4 = new Students("Olena", 78, 92, 63);
        student4.printStudentInfo();
        Students student5 = new Students("Milana", 90, 91, 85);
        student5.printStudentInfo();
    }
}
