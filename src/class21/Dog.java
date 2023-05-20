package class21;

class Animal {

    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

    void speak() {
        System.out.println("Animals Speaking...");
    }

    void sleep() {
        System.out.println("Animals sleeping...");
    }

    void eat() {
        System.out.println("Animals eating");
    }

}

class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("meay meya...");
    }

    @Override
    void eat() {
        System.out.println("Cat`s likes to eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Cat`s like to sleep around 15 hours in a day");
    }

}

class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("woof woof...");
    }

    @Override
    void eat() {
        System.out.println("Dogs likes to eat meat");
    }

    void run(){
        System.out.println("Dog can run fast");
    }


    @Override
    void sleep() {
        System.out.println("Dog`s like to sleep around 8 hours");
    }

}

class Horse extends Animal {

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

        // we can override only the methods that comes from the parent class
        @Override
        void speak() {
            System.out.println("brrr brrr...");
        }

    @Override
    void eat() {
        System.out.println("Horse likes to eat carrots and grass");
    }

    @Override
    void sleep() {
        System.out.println("Horses usually sleep 4 hours");
    }

}

class AnimalTester {

    public static void main(String[] args) {
        Dog obj = new Dog("riki", "white", "shepard");
        obj.printInfo();

        // parent class variable can store the objects of the child classes
        Animal obj1 = new Animal("jeky", "black", "leopard");
        obj1.printInfo();

        Animal[] animals = {new Animal("rokky", "black", "leo"), new Cat("riki", "white", "shepard")};
        for (Animal a : animals) {
            a.printInfo();
        }


    }
}

