package class26.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
*/

    public static void main(String[] args) {
        var findSum = new ArrayList<>(Arrays.asList(2, 4, 3, 1, 2, 4, 4));
        int sum = 0;
        for (var s : findSum) {
            sum += s;
        }
        System.out.println(sum);
    }
}
