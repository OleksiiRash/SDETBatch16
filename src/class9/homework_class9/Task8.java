package class9.homework_class9;

public class Task8 {
    public static void main(String[] args) {

        // Task 8: Create an array to store char values and then print those in reverse order

        char[] grade = {'A', 'B', 'C', 'D'};
        for (int i = grade.length - 1; i >= 0; i--) { // grade.length-1 = 4-1
            System.out.print(grade[i] + " ");
        }

    }
}
