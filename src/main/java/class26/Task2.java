package class26;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "DC");
        countries.put("Canada", "Toronto");
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("England", "London");
        countries.put("Spain", "Valencia");
        countries.put("Ukraine", "Kyiv");

        for (String s : countries.keySet()) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        for (String v : countries.values()) {
            System.out.println(v);
        }
        System.out.println("-----------------------");
        // Var keyword is used here instead of typing Map.Entry<String,String>
        for (var m : countries.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
}
