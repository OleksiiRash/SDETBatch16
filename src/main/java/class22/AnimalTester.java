package class22;

public class AnimalTester {

    public static void main(String[] args) {

        Animal[] animals = {

                new Dog("Marko", "White", "Shepard"),
                new Cat("Barsik", "Black", "Persian"),

        };

        for (Animal a : animals) {
            a.printInfo();
            a.eat();
            a.sleep();
            a.speak();
            System.out.println();
        }


    }
}

