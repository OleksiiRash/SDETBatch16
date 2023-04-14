package class10.projectHW;

public class Task10 {
    public static void main(String[] args) {

        // 10. Write a program to print out duplicate elements from an Array of Strings

        String [] duplicate = {"Alex", "Alex", "Mark", "Kevin", "Mark", "Mark", "Mark", "Mark", "Mark"};

        // Create an array to store the frequency of each string
        int[] repeat = new int[duplicate.length];

        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i + 1; j < duplicate.length; j++) {
                if (duplicate[i].equals(duplicate[j])) {
                    repeat[i]++;
                }
            }
        }

        for (int i = 0; i < repeat.length; i++) {
            if (repeat[i] > 0) {
                System.out.println(duplicate[i] + " ");
            }
        }



    }
}
