package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {

        // String is a non-primitive data type, and with non-primitive data types we
        // can't use relational operators

        String name = "Mark";

        //name.equals("Corey") => checks if name and the value that we write
        // inside equals() are same or not

        if(name.equals("Jacob")){ // we need to use variable + .equals
            System.out.println("I like swimming");
        }
        else {
            System.out.println("I like programming");
        }


    }
}
