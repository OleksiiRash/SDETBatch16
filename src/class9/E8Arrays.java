package class9;

public class E8Arrays {
    public static void main(String[] args) {

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // нужно разобрать еще раз потом

        char[] symbols = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int j = symbols.length - 1; j >= 0; j--) { // in arrays, we have 6 values but integers we have 5 so we minuses 1
            System.out.print(symbols[j] + " ");
        }



    }
}
