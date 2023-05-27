package javaOOPsProject.Task7;

public class Task7Tester {

    public static void main(String[] args) {


        Marks studentA = new A(55, 70, 85);
        System.out.println(studentA.getPercentage());

        Marks studentB = new B(45, 75, 85, 92);
        System.out.println(studentB.getPercentage());


    }
}
