package class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name = "Today is Saturday";
        System.out.println(name.indexOf('i')); // if it is only one character it is print the index of the one
        System.out.println(name.indexOf('a')); // if we have multiply characters - it will gives us the index of the first found element
        // start searching from index 4
        System.out.println(name.indexOf('a', 4));


    }
}
