package class7.homework_class7;

public class HW4 {
    public static void main(String[] args) {

        // Task 4: Print odd numbers between 20 and 50 (2 ways)

        // way 1

        int i = 20;
        while (i <= 50) {
            if (i % 2 != 0) // or we can use this i+!=2
                System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // way 2

        for (i = 20; i <= 50; i++) {
            if (i % 2 != 0) // i+!=2
                System.out.print(i + " ");
        }

        System.out.println();

        // way 3 do while loop

        int j = 20;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        while (j <= 50);


    }
}
