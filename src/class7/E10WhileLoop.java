package class7;

public class E10WhileLoop {
    public static void main(String[] args) {

        /*
        add all the numbers from 1 to 10 and display the result 55
        first write a loop that goes from 1 to 10
        create a variable to hold the sum and add all the numbers to that variable in each iteration
         */

        int num = 1;
        int sum = 0;
        while (num <= 10) { // here we increase this sum by 1 till 10 and getting finally 55
            sum += num; // sum = sum + num
            num++;
        }

        System.out.println("Sum = " + " " + sum);


    }
}
