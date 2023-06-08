package class28;

public class E4Exceptions {
    public static void main(String[] args) {

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");

        try {
            int[] arr = new int[-5];

        } catch (NegativeArraySizeException e) { // we can specify general Exception if we don`t know or not assume the exception or error!
            System.out.println("Plan b");
            System.out.println(e.getMessage());
        }

        try {
            "name".charAt(10);
        } catch (Exception e) {
            System.out.println("Plan c");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Plan d");
            System.out.println(e.getMessage());
        }

        try {
            String name = null;
            name.length();
        } catch (Exception e) {
            System.out.println("Plan f");
            System.out.println(e.getMessage());
        }


        System.out.println("line 6");

    }


}

