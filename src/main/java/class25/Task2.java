package class25;

import java.util.Arrays;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {


        TreeSet<String> countries = new TreeSet<>();
        countries.addAll(Arrays.asList("Spain", "USA", "Canada", "Ukraine", "Italy", "Poland", "France", "Andorra"));
        System.out.println(countries);
        for (String c : countries) {
            System.out.println(c);
        }


    }
}
