package class12;

public class E8StringDemo {
    public static void main(String[] args) {

        // method chaining calling multiple methods on the same line
        String sentence="   JAVA is very very easy";
        // method chaining - possible with a String Class
        sentence = sentence.trim().toLowerCase(); // we can chain the methods like here
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));


    }
}
