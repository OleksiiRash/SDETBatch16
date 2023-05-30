package class25;

import java.util.Arrays;
import java.util.HashMap;

public class E7Maps {

    public static void main(String[] args) {

        // we need to pass to data types in <>
        // map is not part of the collection framework
        // we can`t use the same value again, it will be overwritten
        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("Apple", 2.5);
        grocery.put("Banana", 11.3);
        grocery.put("Kiwi", 8.5);
        grocery.put("Soap", 4.5);
        grocery.put("Kandy", 1.5);
        grocery.put("Apple", 12.5);
        System.out.println(grocery);
        System.out.println(grocery.size()); // will return the unique values count
        System.out.println(grocery.containsKey("Milk"));
        System.out.println(grocery.containsValue(12.5));
        System.out.println(grocery.isEmpty());




    }
}
