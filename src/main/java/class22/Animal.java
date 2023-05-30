package class22;

public abstract class Animal {

/*
create 3 animals like Dog Cat and Horse
define 3 common methods in each class like speak eat and sleep.
create the object of all the classes and call the methods.
*/

    private String name;
    private String color;
    final private String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();

    abstract void eat();

    abstract void sleep();

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

}

class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Woof Woof...");
    }

    @Override
    void eat() {
        System.out.println("chewing bones...");
    }

    @Override
    void sleep() {
        System.out.println("Zzzzzzzzzzz....");
    }
}

class Cat extends Animal {

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Myay Myay...");
    }

    @Override
    void eat() {
        System.out.println("drinking the milk...");
    }

    @Override
    void sleep() {
        System.out.println("Zzzzzzzzzzz.... 14 hours in a day");
    }
}
