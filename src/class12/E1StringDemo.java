package class12;

public class E1StringDemo {

    public static void main(String[] args) {

        // first that we do it is creating an object of that class

        // className objectName = new ClassName(); - syntax of creating object of the Class!
        // String string = new String ("Alex"); // this is how we need to call the object in the class
        String string1 = "Alex"; // most widely used one
        System.out.println(string1.length());

        if (string1.length() > 10) {
            System.out.println("tool long name");
        } else {
            System.out.println("good length");
        }


    }
}
