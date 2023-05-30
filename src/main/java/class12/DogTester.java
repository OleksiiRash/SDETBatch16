package class12;

public class DogTester {

    public static void main(String[] args) {

        // in tester class we execute the main method

        Dog actualDog = new Dog();
        actualDog.name = "Star";
        actualDog.age = 23;
        actualDog.breed = "German";
        actualDog.color = "Black";
        actualDog.weight = 50;
        actualDog.isFat = true;

        actualDog.bark();


        Dog newDog1 = new Dog();
        newDog1.name = "Husky";
        newDog1.age = 21;
        newDog1.breed = "Spain";
        newDog1.color = "Black";
        newDog1.weight = 42;
        newDog1.isFat = false;

        newDog1.sleep();

    }
}
