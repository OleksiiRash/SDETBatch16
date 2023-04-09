package class9;

public class E9Arrays {
    public static void main(String[] args) {

        // Enhanced for loop

        String[] names = {"Alex", "Mark", "Kevin", "Olena",};
        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();

        // option 1

        String[] countries = {"USA", "Canada", "France", "UK", "Ukraine"};
        for (String name : countries) { // for Enhanced for loop better call the first variable always name will be easy to understand
            System.out.println(name + " ");
        }

        System.out.println();

        // option 2

        String[] country = {"USA", "Canada", "France", "UK", "Ukraine"}; // 4 integers - calculation starting from 0
        for (int i = 0; i <= country.length-1; i++) {
            System.out.println(country[i] + " ");
        }


    }
}
