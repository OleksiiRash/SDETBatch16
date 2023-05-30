package class12;

public class E5StringDemo {

    public static void main(String[] args) {

        String name = "";
        String name1 = "     ";
        System.out.println(name.isEmpty()); // return false even if it is empty space
        System.out.println(name1.isBlank()); // return false only if the value contains really something

    }
}
