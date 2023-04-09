package class9.homework_class9;

public class Task2 {

    public static void main(String[] args) {

        /*
        Task 2 Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        String [] names = {"Alamir", "Nigora", "Aydin", "Boris", "Oleksii"};
        System.out.println(names[4]);

        System.out.println();

        String [] namesNew = new String[5];
        namesNew[0] = "Alamir";
        namesNew[1] = "Nigora";
        namesNew[2] = "Aydin";
        namesNew[3] = "Boris";
        namesNew[4] = "Oleksii";

        System.out.println(namesNew[4]);


    }

}
