package class10.projectHW;

public class Task7 {
    public static void main(String[] args) {

        /*
        7. Write a Java Program to print the first 10 numbers of
        Fibonacci series - is a sequence of numbers in which each number
        after the first two is the sum of the two preceding ones.

        Example: 0, 1, 1 (0+1), 2 (1+1), 3 (1+2), 5 (2+3), 8 (3+5), 13 (5+8), 21 (8+13), 34 (13+21)
         */

        int n = 10;
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }


    }
}
