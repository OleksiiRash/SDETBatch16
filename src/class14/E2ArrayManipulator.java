package class14;

public class E2ArrayManipulator {

    /*
    create a method that will take an int array call it sumArr
    and return the sum of all the elements from that array
    create the object of the class and call the method.
     */

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {


        E2ArrayManipulator obj = new E2ArrayManipulator();
        int[] arr = {10, 20, 30, 40, 50};
        int print = obj.sumArr(arr);
        System.out.println(print);



    }
}





