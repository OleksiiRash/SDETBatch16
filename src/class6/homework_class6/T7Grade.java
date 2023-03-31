package class6.homework_class6;

import java.util.Scanner;

public class T7Grade {
    public static void main(String[] args) {

        /*
        Task 7: Allow user to enter grade (A, B, or C etc...) and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the grade from A to D:");
        char grade = scan.next().charAt(0);
        String gradeExplain = "";
        String gradeExplain2 = "";

        switch (Character.toLowerCase(grade)) {
            case 'a':
                gradeExplain = "Excellent - typically represents mastery of the subject matter and a high level of achievement.";
                System.out.println("A-Excellent");
                break;
            case 'b':
                gradeExplain = "Good - indicates a solid understanding of the material and above-average performance.";
                System.out.println("B-Good");
                break;
            case 'c':
                gradeExplain = "Average - suggests an acceptable level of understanding and performance, but not outstanding.";
                System.out.println("C-Average");
                break;
            case 'd':
                gradeExplain = "Bad - indicates that the student has not met the expectations or requirements for satisfactory performance and may need to improve their skills or knowledge.";
                System.out.println("D-Bad");
                break;
            default:
                gradeExplain = "Not Acceptable";
                gradeExplain2 = "Please enter the grade from A to D";

        }
        System.out.println("You was entered the grade " + grade + " which means:");
        System.out.println(gradeExplain);
        System.out.println(gradeExplain2);
    }
}
