package class7;

public class E11DoWhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i > 10) {
            System.out.println(i);
            i++;
        }

        // do while loop - execute at least once and then check the conditions

        do {
            System.out.println(i);
            i++;
        } while (i > 10);


    }
}
