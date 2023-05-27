package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class E8ArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Marin", "Vlad", "Zak", "Alina", "Axel"));

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Zak"));
        System.out.println(names.size());

        for (String name : names) {
            System.out.print(name + " ");
        }


    }
}
