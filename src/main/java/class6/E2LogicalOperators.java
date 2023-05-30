package class6;

public class E2LogicalOperators {
    public static void main(String[] args) {

        /*with this "||" logical operator we need only 1 of the conditions will be true
         even if we have else false, so we anyway print true, otherwise with "&&" we need only 1 false, and it will be false
         */

                double marksInMath=80;
                double marksInScience=95;

                if(marksInMath>90 && marksInScience>90){
                    System.out.println("You are a brilliant student ");
                }else{
                    System.out.println("You need to work hard");
                }



            }
        }

