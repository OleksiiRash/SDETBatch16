package class20;

public class AnimalTester {

    public static void main(String[] args) {

        Animal animal = new Animal("Holi", "White", 5);

        Dog dog = new Dog("Jam", "Brown", 10);
        Cat cat = new Cat("Tom", "White", 5);
        Horse horse = new Horse("Jam", "Brown", 10);

        animal.sleep();
        animal.eat();
        dog.sleep();
        dog.eat();

    }
}
