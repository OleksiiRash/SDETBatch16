package class25;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {


        List<String> aList = new ArrayList<>(Arrays.asList("John", "Jane", "James", "Jasmine", "Jane", "James"));
        System.out.println(aList);
        System.out.println("----------------------------");
        LinkedHashSet<String> aListnoDuplicates = new LinkedHashSet<>(aList);
        System.out.println(aListnoDuplicates);


    }
}
