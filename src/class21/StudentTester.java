package class21;

public class StudentTester {
    public static void main(String[] args) {

        Student[] students = {
                new SyntaxStudent("Alex", 33, 'A'),
                new CollegeStudent("Mark", 31, 'B'),
                new SchoolStudent("Olena", 31, 'C'),
        };

        for (Student student : students) {

            if (student instanceof SyntaxStudent) { // using isntanceof for the student means that we check all objects stored in the array
                SyntaxStudent s = (SyntaxStudent) student;
                s.extraClasses();
            }

            student.printInfo();
            student.studyLanguage();
            student.sleep();
        }
    }
}