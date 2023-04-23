package class3;

public class TypeCasting {
    public static void main(String[] args) {

        // type casting learning

        double a1 = 22.5;
        int b2 = (int) a1;

        int c1 = (int) 10.5;
        int c2 = (int) 10.5; // without (int) we can`t initialize the value, important to add before value the (int)
        double c3 = (int) 10.5;
        double c4 = (int) 23.5;

        System.out.println(b2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        byte a = 10;
        byte b = 20;
        int result = a * b; // type promotion
        System.out.println(result);

    }
}
