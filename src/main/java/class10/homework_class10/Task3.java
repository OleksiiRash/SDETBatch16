package class10.homework_class10;

public class Task3 {
    public static void main(String[] args) {

        /*
        Task 3: Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
         */


        String[][] grocery = {
                {"Broccoli", "Carrots", "Cauliflower", "Cucumber"}, // veggies
                {"Apples", "Bananas", "Grapes", "Kiwi"}, // fruits
                {"Milk", "Cheese", "Butter", "Eggs"}, // dairy
                {"Chocolate", "Cookies", "Cake", "Candy"} // sweets
        };

        // loop 1
            for (String[] row : grocery) {
                for (String item : row) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }

        System.out.println();

        // loop 2

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j] + " ");
            }
            System.out.println();
        }


    }
}
