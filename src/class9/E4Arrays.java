package class9;

public class E4Arrays {
    public static void main(String[] args) {

        String[] names = {"Alex", "Mark", "Zak", "Kevin", "Olena"};
        for (int i = 0; i < names.length-1; i++) { // we will see first 4
            System.out.print(names[i] + " ");
        }

        System.out.println();

        String[] namesNew = {"Alex", "Mark", "Zak", "Kevin", "Olena"};
        int j = 0;
        while (j < namesNew.length-1) { // we will see first 4
            System.out.print(namesNew[j] + " ");
            j++;

        }


    }
}
