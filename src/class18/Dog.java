package class18;

public class Dog extends Animal {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public Dog(String name, String color, String breed, int age) {
        this(name, color, breed); // we are referring the previous constructor
        this.age = age;
    }

    public Dog(String name, String color, String breed, int age, double weight) {
        this(name, color, breed, age); // we are referring the previous constructor
        this.weight = weight;
    }

    public static void speak() {
        System.out.println("dog gav gav");
    }

}