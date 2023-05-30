package class14;

public class E6 {

    /*
    create a method which returns true or false and takes an int
    number as a parameter. if number is
    even it returns true otherwise it returns false.
    Name of the method should be isEven
    */

    boolean isEven(int num) {
        boolean isFound = false;
        if (num % 2 == 0) {
            isFound = true;
        }
        return isFound;
    }

    public static void main(String[] args) {


        E6 obj = new E6();
        int num = 12;
        boolean result = obj.isEven(num);
        System.out.println(result);


    }
}
