package class11;

public class StudentsTester {
    // All the classes can act as datatype
    public static void main(String[] args) {

        Students studentAlex = new Students();
        studentAlex.sleep();

        System.out.println("------------------------");

        // String concat(String str) method
        String s = "Strings are immutable";
        s = s.concat(" all the time"); // we are concat to the s the new String
        System.out.println(s);

        System.out.println("------------------------");

        String art = "";
        // boolean isEmpty() method check whether a String is empty or not
        boolean b = art.isEmpty();
        System.out.println(b);

        System.out.println("------------------------");


    }
}
