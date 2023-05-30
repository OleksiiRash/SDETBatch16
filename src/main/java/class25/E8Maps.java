package class25;

import java.util.LinkedHashMap;

public class E8Maps {
    public static void main(String[] args) {

        // it is maintenance the order
        LinkedHashMap<Integer, String> rank = new LinkedHashMap<>();
        rank.put(1, "James");
        rank.put(2, "Adam");
        rank.put(3, "John");
        rank.put(4, "Jimmy");
        rank.put(5, "Alex");
        System.out.println(rank);
        rank.remove(2);
        System.out.println(rank);
        rank.replace(1, "Jack");
        System.out.println(rank);


    }
}
