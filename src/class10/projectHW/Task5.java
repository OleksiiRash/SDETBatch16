package class10.projectHW;

public class Task5 {

    public static void main(String[] args) {

        /*
        5. Write a program to swap 2 numbers without a
        temporary variable?
         */

        int a = 2;
        int b = 4;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
