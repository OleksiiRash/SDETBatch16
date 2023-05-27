package class24;

import java.util.ArrayList;

public class E12ArrayList {
    public static void main(String[] args) {

        // Create an arrayList of drinks call it. If any drink has letter “a” or “e” replace it with water

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Milk");
        drinks.add("Water");
        drinks.add("Juice");

        for (int i = 0; i < drinks.size(); i++) {
            String word = drinks.get(i);
            if (word.contains("a")||word.contains("e")){
                drinks.set(i, "Water"); // method .set is replacing the elements
            }
        }


        //drinks.replaceAll(x -> x.contains("a") || x.contains("e") ? "water" : x);
        System.out.println(drinks);


    }
}
