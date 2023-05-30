package class13;

public class E6StringDemo {
    public static void main(String[] args) {

        String str="Wife";
        str.toLowerCase(); // false - will not change
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Wife");
        str2.reverse(); // true - will work
        System.out.println(str2);
    }
}