package class21;

public class E1Poly {

    public static void main(String[] args) {

        Animal[] animal = {
                new Cat("Barsik", "white", "persian"),
                new Dog("Henry", "white", "buldog"),
                new Horse("Macho", "black", "shepard")
        };

       for (Animal newAnimal : animal){
           newAnimal.printInfo();
           newAnimal.eat();
           newAnimal.speak();
           newAnimal.sleep();
       }

       Animal newAnimal = new Dog("Henry", "white", "buldog");
       //we must type cast the animal back to a dog to call the run method, as this rum method only exist in the Dog class.
       Dog d = (Dog) newAnimal;
       d.run();

       // direct way without using the variable
       ((Dog)newAnimal).run();







    }
}
