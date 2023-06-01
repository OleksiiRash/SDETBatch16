package class26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E3Maps {

    public static void main(String[] args) {

        Map<String, Double> drinks = new HashMap<>();
        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.5);
        drinks.put("Cofee", 5.5);
        drinks.put("Tea", 5.5);

        Set<Map.Entry<String, Double>> entrySet = drinks.entrySet(); // we are calling Map.Entry<String, Double> main part

        /*
        for (Map.Entry<String, Double> e : entrySet) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        */

        entrySet.removeIf(x -> x.getKey().contains("i") && x.getValue() > 2);
        System.out.println(drinks);





    }
}
