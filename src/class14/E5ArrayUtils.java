package class14;

public class E5ArrayUtils {
    /*
    crate a method, call it contains. It should take an array of int and an
    int number in the method body. It should search the array for that number,
    if number is present in the array method should return true, otherwise method
    should return false. In a separate class call the method and test it for below
    input {10,20,45} number 20
    15
     */

    boolean contains(int[] arr, int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;
                break; // don`t forget to use break in order not search for the next elements in the array if it is already find it
            }
        }
        return isFound;
    }


    public static void main(String[] args) {


        E5ArrayUtils obj = new E5ArrayUtils();
        int[] find = {20, 30, 40, 50, 60, 70};
        int num = 30;
        boolean result = obj.contains(find, num);
        System.out.println(result);


    }
}
