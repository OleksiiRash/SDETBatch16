package class12;

public class E4StringDemo {
    public static void main(String[] args) {

        String firstName="Ana";
        String lastName= "Farwa";

        String fullName=firstName+lastName; // Most widely used approach - it works with null value.
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName)); // if we store the null value inside this method will be fail.


    }
}
