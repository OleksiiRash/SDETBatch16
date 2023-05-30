package class25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class E6CollectionsFramework {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Kiwi", "Banana", "Orange", "Orange"));
        System.out.println(fruits);

        HashSet<String> hashSet = new HashSet<>(fruits); // we are converting the ArrayList to the HashSet
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(hashSet);
        System.out.println(linkedHashSet);




    }
}

