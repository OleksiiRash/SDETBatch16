package class13.homowork_class13;

public class Task3 {

    public static void main(String[] args) {

/*
Task3_CountNofWords:
How would you swap 2 strings without a temporary variable?
 */

        String str1 = "Hello";
        String str2 = "World";
        // Before swapping
        System.out.println(str1);
        System.out.println(str2);
        // Swapping without a temporary variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        // After swapping
        System.out.println(str1);
        System.out.println(str2);


    }
}
