package class16;

public class Person {

    private String password;
    static double bankBalance=1234455;


    private void printPassword(){ // we can`t call this method from another class
        System.out.println(password);
    }

    private static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {

        Person alex = new Person();
        alex.password = "123467";
        alex.printPassword();
        System.out.println(bankBalance);


    }
}
