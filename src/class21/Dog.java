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

}

class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
}

class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
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

