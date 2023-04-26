package class13;

public class E5StringVsStringBuilder {

    public static void main(String[] args) {

        String s = new String("Java"); // String object
        String m = "Java"; // String

        /*
        Main differences is comparison capabilities:
        Comparing strings using the == operator: In Java, the == operator compares object references,
        not the contents of the objects themselves.
        So if you create two String objects using string literals like "Java",
        they may or may not refer to the same object in memory,
        depending on whether an identical string already exists in the String pool.
        On the other hand, if you create two String objects using new String("Java"),
        they will always be separate objects, so you can compare them using ==.
         */

        String s1 = new String("Java");
        String s2 = new String("Java");
        String m1 = "Java";
        String m2 = "Java";

        System.out.println(s1 == s2); // false
        System.out.println(m1 == m2); // true

        System.out.println();

        StringBuilder str = new StringBuilder("Java");
        System.out.println(str.length());

        System.out.println();

        String convert = "Java";
        StringBuilder convert2 = new StringBuilder(convert);
        convert2.reverse();
        convert = convert2.toString(); // method that allow us to convert stringBuilder method to the basic string
        System.out.println(convert);










    }
}
