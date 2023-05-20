package class21;

public class Student {

    String name;
    int age;
    char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + grade);
    }

    void studyLanguage() {
        System.out.println("Students studying...");
    }

    void sleep() {
        System.out.println("Students usually sleep around 8 hours");
    }


}

class SyntaxStudent extends Student {
    public SyntaxStudent(String name, int age, char grade) {
        super(name, age, grade);
    }

    @Override
    void studyLanguage() {
        System.out.println(name + " Syntax Student studying Java language");
    }

    @Override
    void sleep() {
        System.out.println(name + " Syntax student usually sleep around 4-5 hours");
    }

    void extraClasses() {
        System.out.println(name + " Syntax students learn as well Selenium for the automation");
    }


}

class CollegeStudent extends Student {

    public CollegeStudent(String name, int age, char grade) {
        super(name, age, grade);
    }

    @Override
    void studyLanguage() {
        System.out.println("College Students studying math and any kind of programming language that they choose");
    }

    @Override
    void sleep() {
        System.out.println("College Students usually sleep around 7 hours");
    }

}

class SchoolStudent extends Student {

    public SchoolStudent(String name, int age, char grade) {
        super(name, age, grade);
    }

    @Override
    void studyLanguage() {
        System.out.println("School Students studying only the math");
    }

    @Override
    void sleep() {
        System.out.println("School Students usually sleep around 10 hours");
    }


    public static void main(String[] args) {

        Student[] students = {
                new SyntaxStudent("Alex", 33, 'A'),
                new CollegeStudent("Mark", 31, 'B'),
                new SchoolStudent("Olena", 31, 'C'),
        };

        for (Student student : students) {
            student.printInfo();
            student.studyLanguage();
            student.sleep();
        };

        Student student1 = new SyntaxStudent("Alex", 33, 'A');
        SyntaxStudent s = (SyntaxStudent) student1;
        s.extraClasses();
        //((SyntaxStudent) student1).extraClasses();

    }
}


