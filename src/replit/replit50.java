package replit;

public class replit50 {
    public static void main(String[] args) {

        /*
        For you to do:**
        Step 1: Initialize the i value as int i=7.
        Step 2: Write a program to print a sequence of numbers starting from 7 to 98.
        While Loop
        Output:

        7
        14
        21
        28
        35
        42
        49
        56
        63
        70
        77
        84
        91
        98
         */

        int i = 7;
        while (i<=98){
            if (i % 7 == 0)
            System.out.print(i + " ");
            i++;
        }

    }
}
