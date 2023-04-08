package class9;

public class E5Arrays {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        char[] symbols = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i <= symbols.length; i+=2) { // instead of this i%2==0 we use this i+=2 - fewer lines of codes
            System.out.print(symbols[i] + " ");
        }


    }
}
