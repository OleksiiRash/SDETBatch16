package class13;

public class MethodTester {

    public static void main(String[] args) {

    // we are calling a method from the Printer class
    Printer obj = new Printer();
    obj.printSomething();

    System.out.println();

    // we create a new method in Printer Class and void it from the Printer Class
    obj.printWord("Alex");
    obj.printWord("Mark");

    System.out.println();

    obj.printWordManyTimes("I love Java", 4);

    System.out.println();
    // we create a new method in Math Class and void it from the void add method in the Math Class
    Math objMath = new Math();
    objMath.add(1,4);
    objMath.multiply(2,4);


    }

}
