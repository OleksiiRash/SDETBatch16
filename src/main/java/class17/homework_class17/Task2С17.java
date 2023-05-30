package class17.homework_class17;

public class Task2С17 {

/*
Task2С17:
Write a java class that have 4 constructors with 4 different access levels of constructors
(private, public, default, protected)

and create 4 objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package
and observe result.
*/

    private String name;

    private String jobTitle;
    private int age;
    private double salary;

    private int bankBalance;

    private Task2С17(double salary) {
        this.salary=salary;
        System.out.println("Salary" + " " + salary);
    }

    protected Task2С17(int bankBalance) {
        this.bankBalance=bankBalance;
        System.out.println("Bank Balance" + " " + bankBalance);
    }

    public Task2С17(String name, String jobTitle) {
        this.name=name;
        this.jobTitle=jobTitle;
        System.out.println(name + " " + jobTitle);
    }

    Task2С17(){

    }

    public static void main(String[] args) {

        Task2С17 obj = new Task2С17();
        System.out.println(obj.name="Oleksii");
        Task2С17 obj2 = new Task2С17("Oleksii", "SDET");
        Task2С17 obj3 = new Task2С17(145000.5);
        Task2С17 obj4 = new Task2С17(2000000);




    }
}
