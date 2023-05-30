package class3;

public class RelationOperatorsAndIf {
    public static void main(String[] args) {

        /*
         Relation Operators in Java:

         == equal to
         != not equal to
         <= less than or equal to
         >= greater or equal to
         < less than
         > greater
         */

        int d = 20, e = 30; // можно записывать несолько variables and values сразу в data type как указано тут.
        if (d != e) {
            System.out.println("Its True!");
        }
        else
        {
            System.out.println("Its False!");
        }

        double f = 44.5, g = 55.5, h = 23.5;
        f = 45.5;
        g = 65.5;
        h = 24.5;

        if (f >= h && g >= h) { // && - we can use this operator to add extra variable
            System.out.println("Great True Things!");
        }
        else
        {
            System.out.println("Not True Things!");
        }

        int number1 = 10;
        int number2 = 20;

        System.out.println(number1>number2);

        // test

        int myBalance = 300000;

        if (myBalance>500000) {
            System.out.println("Le`s go Shopping!");
        }
        else
        {
            System.out.println("Save Money!");
        }



    }
}
