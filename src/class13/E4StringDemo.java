package class13;

public class E4StringDemo {
    public static void main(String[] args) {

        // we use .split() method together with arrays if we need to split the block of values to the separate Strings
        String str = "Today is Sunday. we have java class? we like java";
        String[] strArr = str.split("[.!?]"); // here we split sentence for 3 different strings using the regex and store them in array
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim()); // in order to get all the line by line we need to use a loop

        System.out.println();
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i].trim());
        }


    }
}
