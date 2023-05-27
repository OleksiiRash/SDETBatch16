package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class E2ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 100, 200));
        System.out.println(numbers);

        for (Integer num : numbers){
            System.out.println(num);
        }

        System.out.println("******************************");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("******************************");

        int i = 0;
        while (i < numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }

        System.out.println("******************************");
        int j = 0;

        do {
            System.out.println(numbers.get(j));
            j++;
        } while (j<numbers.size());









    }
}
