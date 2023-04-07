package replit;

public class replit53 {
    public static void main(String[] args) {

        /*
        For you to do:
        Using do while loop print even numbers from 20 to 1
        expected Output:

        20
        18
        16
        14
        12
        10
        8
        6
        4
        2
         */

        int i = 20;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        } while (i > 0);

    }
}
