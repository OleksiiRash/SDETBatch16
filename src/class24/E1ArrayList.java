package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class E1ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5)); // using this method we can add multiply values in the ArrayList
        System.out.println(arrayList);

        /*
        byte => Byte
        short => Short
        int => Integer
        long => Long
        float =>Float
        double =>Double
        boolean => Boolean
        char => Character
         */
        Integer integer = 10;
        Integer integer1 = 20;
        String str = "no";

        System.out.println(Integer.MAX_VALUE);
        int num = 10;

        System.out.println(integer1 * integer);

    }

}
