package class26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        Map<Integer, String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Microsoft");
        building.put(4,"Amazon");
        building.put(5,"Target");
        building.put(5,"Target");
        building.put(7,"Best buy");
        System.out.println(building.size());
        building.replace(4, "Nike");
        System.out.println(building);
        //building.values().removeIf(x -> x.contains("Best"));
        building.remove(7);
        System.out.println(building);





    }
}
