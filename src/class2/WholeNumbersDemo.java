package class2;

public class WholeNumbersDemo {

    public static void main(String[] args) {

        /*
        all the primitive data types start from the lowercase
         */

        String name = "John Doe";
        byte myByte = 127; // “myByte” mean that here should be your name of data
        short distance = 1000;
        int myInt = 100000;
        long distanceToTheMoon = 384400L;
        float distanceToTheMoonNew = 384.400f;
        double distanceToTheMoonCorrect = 384.400;
        boolean myBoolean = true;
        char myChar = 'A';
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Substring: " + name.substring(5));
        System.out.println(myByte);
        System.out.println("Distance" + " " + distance);
        System.out.println(myInt);
        System.out.println("Distance To The Moon:" + " " + distanceToTheMoon + " " + "Km");
        System.out.println("Distance To The Moon:" + " " + distanceToTheMoonNew + " " + "Km");
        System.out.println("Distance To The Moon:" + " " + distanceToTheMoonCorrect + " " + "Km");
        System.out.println(myBoolean);
        System.out.println(myChar);
    }


}
