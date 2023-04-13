package class10.homework_class10;

public class Task6 {
    public static void main(String[] args) {

        /*
        Task 6: Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate how many total countries been stored.
         */

        String[][] countries = {

                {"United States of America", "Canada", "Mexico", "Jamaica"}, // North America
                {"Brazil", "Argentina", "Chile", "Colombia"}, // South America
                {"United Kingdom", "France", "Germany", "Spain"}, // Europe
                {"China", "Japan", "India", "South Korea"}, // Asia
                {"Nigeria", "Egypt", "South Africa", "Kenya"} // Africa
        };

        // loop 1
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println();

        // loop 2
        int sumNew = 0;
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                sumNew++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Total countries = " + sumNew);

    }
}
