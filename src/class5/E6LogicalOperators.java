package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {


        System.out.println(true || false || false);
        int age = 17;
        char gender = 'F';
        String name = "Marry";

        if (age < 18 || age > 60) {

            /*with this "||" logical operator we need only 1 of the conditions will be true
            even if we have else false, so we anyway print true, otherwise with "&&" we need only 1 false, and it will be false
            */

            System.out.println("You will get a discount");
        }

        if (gender == 'M' || age > 60 || !name.equals("Marry")) { // here we don`t print nothing, because all not true
            System.out.println("You will get a discount");
        }


    }
}

