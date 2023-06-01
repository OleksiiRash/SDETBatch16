package class26;

import java.util.*;

public class E1Maps {

    public static void main(String[] args) {

        Map<String, Double> drinks = new HashMap<>();
        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.5);
        drinks.put("Cofee", 5.5);
        drinks.put("Tea", 5.5);

        drinks.keySet().removeIf(x -> x.contains("i"));

        //var keys = drinks.keySet();
        //keys.removeIf(x -> x.contains("i"));
        System.out.println(drinks);



    }
}
