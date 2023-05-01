package class15;

public class SyntaxEmployee {

/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID, salary and CEO for each of the objects
 */

    String empID;
    int salary;
    static String CEO = "Sumair"; // variable name with static we always use a convention with uppercase

    public static void main(String[] args) {

        SyntaxEmployee obj = new SyntaxEmployee();
        obj.empID = "1234560";
        obj.salary = 150000;
        System.out.println(obj.empID);
        System.out.println(obj.salary);
        // System.out.println(obj.ceo); // better not use in this way static variables
        System.out.println(SyntaxEmployee.CEO);

        System.out.println();

        SyntaxEmployee obj1 = new SyntaxEmployee();
        obj1.empID = "12345601";
        obj1.salary = 90000;
        System.out.println(obj1.empID);
        System.out.println(obj1.salary);
        System.out.println(SyntaxEmployee.CEO);



    }
}
