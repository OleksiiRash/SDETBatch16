package class1;

public class TestJavaProgram {
    public static void main(String[] args) {
        String one = "my favorite number";
        String two = "is";
        one = "number";
        two = "="; // using the upper command we can easily change the string name
        int number1 = 5;
        int number2 = 5;
        int sum = number1 + number2;

        System.out.println(one + " " + two + " " + (5+2)); // all that is in like (5+3) = 8
        System.out.println(one + " " + two + " " + 5+2); // all like this will add 53 instead of 8
        System.out.println("my favorite number" + " " + "is" + " " + (5+2)); // as well, we can use + " " + combination as a separator
        System.out.println(one + " " + two + " " .concat ("5"+"2"));
        System.out.println(sum);

    }

}



