package class25;

import java.util.*;

public class E9Maps {
    public static void main(String[] args) {


        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("LipStick", 100.0);
        makeup.put("BlushOn", 68.0);
        makeup.put("Lipstick", 100.0);
        makeup.put("EyeLiner", 80.0);
        makeup.put("Foundation", 120.0);

        // we can replace Set with the collection as well
        Set<String> keys = makeup.keySet(); // we're only getting the values from-the map, not the double values
        Collection<Double> values = makeup.values(); // we can return the numbers only in the form of the collection
        // var keys = makeup.keySet(); / we will use var on the work
        // var values = makeup.values();
        System.out.println(keys);
        System.out.println(values);


    }
}
