package class26;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {

    public static void main(String[] args) {

        Map<String, Double> drinks = new HashMap<>();
        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.5);
        drinks.put("Cofee", 5.5);
        drinks.put("Tea", 5.5);
        drinks.values().removeIf(x -> x > 3.0);
        System.out.println(drinks);





    }
}
