package class7;

public class E9WhileLoop {
    public static void main(String[] args) {

        /*
        Print numbers from 100 to 1
        Print even numbers from 20 to 100
        Print only odd numbers from 100 to 1
         */

        /* int num = 100;
        while (num <= 20) {
            System.out.print(num + " ");
            num++;
        }
         */

        System.out.println();

        /* num = 20;
        while (num <= 100) {
            System.out.print(num + " ");
            num+=2;
        }
        */

        System.out.println();

        int num = 100;
        while (num >= 1) {
            if (num % 2 != 0) { // остаток не ноль, поэтому и выходить что печатет не четные числа
                System.out.print(num + " ");
            }
            num--;
        }


    }
}
