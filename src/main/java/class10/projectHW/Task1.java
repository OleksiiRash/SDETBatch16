package class10.projectHW;

public class Task1 {
    public static void main(String[] args) {

    /*
    1. Create a program that uses an array to store a list of
    temperatures for a week, and then uses a loop to find
    the highest and lowest temperature for the week.
    */

        int[] tempWeek = {22, 14, 25, 18, 11, 17};
        int high = tempWeek[0];
        int low = tempWeek[0];

        for (int i = 0; i < tempWeek.length; i++) {

            if (tempWeek[i] > high) {
                high = tempWeek[i];
            } else if (tempWeek[i] < low) {
                low = tempWeek[i];
            }
        }
        System.out.println("High Temp is " + high);
        System.out.println("Low Temp is " + low);

    }
}
