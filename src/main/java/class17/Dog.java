package class17;

public class Dog {
    private String name; // instance variable - we need to declare here, not in method or constructor as because it will be local
    private String color; // recommended access modifier for the instance variables is private
    private String breed;
    private int age;

    Dog (String dogName, String dogColor, String dogBreed, int dogAge) { // create constructor

        name = dogName; // local variable
        color = dogColor;
        breed = dogBreed;
        age = dogAge;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age);
    }
    // create 5 objects of this dog class provide initial values and for each
    // object call the printInfo method.
}