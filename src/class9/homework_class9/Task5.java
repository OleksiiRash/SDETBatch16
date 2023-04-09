package class9.homework_class9;

public class Task5 {

    public static void main(String[] args) {

        /*
        Task 5: Create an array of animals and store 5 elements into it.
        Using 2 different loops print all elements from the array.
         */


        String[] animals = new String[5];
        animals[0] = "Dog";
        animals[1] = "Cat";
        animals[2] = "Elephant";
        animals[3] = "Lion";
        animals[4] = "Penguin";

        // loop 1

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");

        }

        System.out.println();

        // loop 2

        for (String animal : animals) {
            System.out.print(animal + " ");
        }


    }
}
