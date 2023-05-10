package class18.homework_class18;

import javax.xml.namespace.QName;

public class Teacher {

/*
Write a Java program called Teacher.
Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher.
Test all 4 classes
*/

    String name;
    int age;
    String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void printInfoTeacher() {
        System.out.println("Teacher " + this.name + " " + this.age + " years" + ". Subject is " + this.subject);
    }

    public void gradeAssignments() {
        System.out.println("Teacher " + this.name + " " + "grading assignments for " + this.subject + " teacher " + this.name);
    }

    public void assignHomework() {
        System.out.println("Teacher " + this.name + " " + "assigning homework for " + this.subject + " students");
    }

    public void giveLecture() {
        System.out.println("Teacher " + this.name + " " + "giving lecture on " + this.subject);
    }
}

class MathTeacher extends Teacher {

    private String specialization;

    public MathTeacher(String name, int age, String specialization) {
        super(name, age, "Math");
        this.specialization = specialization;
    }

    public void printInfoMathTeacher() {
        System.out.println("Teacher " + this.name + " " + this.age + " years" + ". Subject is " + this.subject  + ". Specialization is " + this.specialization);
    }

    public void solveMathProblem() {
        System.out.println("Teacher " + super.name + " " + "Solving an " + this.specialization + " problem");
    }
}

class ChemistryTeacher extends Teacher {

    private boolean hasLabAccess;

    public ChemistryTeacher(String name, int age, boolean hasLabAccess) {
        super(name, age, "Chemistry");
        this.hasLabAccess = hasLabAccess;
    }

    public void printInfoChemistryTeacher(){
        super.printInfoTeacher();
    };

    public void conductExperiment() {
        if (this.hasLabAccess) {
            System.out.println("Let`s do experiments in the chemistry lab");
        } else {
            System.out.println("No lab access");
        }
    }
}

class PianoTeacher extends Teacher {

    private int yearsOfExperience;

    public PianoTeacher(String name, int age, int yearsOfExperience) {
        super(name, age, "Piano");
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printInfoPianoTeacher() {
        super.printInfoTeacher();
    }

    public void Music() {
        System.out.println("Lets learn Jazz");
    }


    public static void main(String[] args) {

        Teacher obj = new Teacher("Asghar", 32, "Java");
        obj.printInfoTeacher();
        obj.assignHomework();
        obj.giveLecture();
        obj.gradeAssignments();

        MathTeacher obj1 = new MathTeacher("Alex", 33,"Algebra");
        obj1.printInfoMathTeacher();
        obj1.solveMathProblem();

        ChemistryTeacher obj2 = new ChemistryTeacher("Mark", 42, true);
        obj2.printInfoChemistryTeacher();
        obj2.conductExperiment();

        PianoTeacher obj3 = new PianoTeacher("Kevin", 31, 7);
        obj3.printInfoPianoTeacher();
        obj3.Music();

    }
}
