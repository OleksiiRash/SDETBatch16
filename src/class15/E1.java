package class15;

public class E1 {

/*
The createArray(size) method takes an integer parameter size and
creates an array of that size. It then fills the array with the number
10 using a for loop, and finally returns the array.
*/

// createArray(5) => {10,10,10,10,10}
// createArray(3) => {10,10,10}

    int[] createArray(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = 10;
        }
        return arr;
    }


    public static void main(String[] args) {


        E1 obj = new E1();
        int[] newArr = obj.createArray(3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }


    }
}



