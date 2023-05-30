package class22;

public interface ArrayUtil {

    //search the array for the number if found return true
    public boolean searchArr(int[] array, int number);
}

class Main implements ArrayUtil {

    // Create a method that will find a number from an array.

    public boolean searchArr(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }


    // Create a method to get the average of numbers from an array.

    public double AverageNum(int[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Create a method that will Count how many times the number is appearing in an array.

    public int count(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }

}


