package class7.homework_class7;

public class HW3 {
    public static void main(String[] args) {


        //Task 3: Print even numbers from 20 to 1 (2 ways)

        // 1 option

        int i = 20;
        while (i >= 1) {
            if (i % 2 == 0) // or we can use i+=2
                System.out.print(i + " ");
            i--;
        }

        // 2 option

        for (i = 20; i >= 1; i--) {
            if (i % 2 == 0) // or we can use i+=2
                System.out.print(i + " ");
        }

    }
}
