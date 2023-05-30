package classMath;

public class MathJava {

    public static void main(String[] args) {

        // Math.abs(): This method returns the absolute value of a number.

        int num = -10;
        int absolutNum = Math.abs(num);
        System.out.println(absolutNum);

        System.out.println();

        int num1 = -2343322;
        int newAbsolut = Math.abs(num1);
        System.out.println(newAbsolut);

        System.out.println();

        int[] numbers = {10, 12, 18, 19};
        int max = numbers[0];
        int low = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]); // here inside Math.max() we have special syntax where we need to add two numbers to compare
            low = Math.min(low, numbers[i]);
        }
        System.out.println(max);
        System.out.println(low);

        System.out.println();

        char c = 'A';
        c++; // increment the value
        System.out.println(c);

        




}
}
