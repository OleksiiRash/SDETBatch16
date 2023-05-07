package class17;

public class Person {

    private String dogName;
    private String dogBreed;
    private int dogAge;

    Person(String dogNameNew, int dogAgeNew) {
        dogName = dogNameNew;
        dogAge = dogAgeNew;
        System.out.println(dogName + " is " + dogAge + " years old");
    }

    Person() {
        System.out.println("He is sleeping");
    }

}
