package class9;

public class E2Arrays {
    public static void main(String[] args) {

        int [] numbers = {30, 40, 50, 90};
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

        System.out.println();

        int [] num = {30, 40, 50, 90}; // Enhanced for loop
        for (int i : num) {
            System.out.print(i + " ");

        }
    }
}
