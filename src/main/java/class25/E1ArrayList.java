package class25;

import javaOOPsProject.Task7.A;

import java.util.ArrayList;
import java.util.Arrays;

public class E1ArrayList {

    public static void main(String[] args) {

        /*
        ArrayList=> a class (Its part of the collection's framework)
        <> These are called angle brackets ot diamond operators we
        write the name of the class whose objects we are planning to store in
        an arraylist.
         */

        //creating the object of the car class storing it in a variable car1
        Car car1 = new Car("Audi", "Q7");
        Car car2 = new Car("Honda", "CRV");
        Car car3 = new Car("BMW", "I7");
        ArrayList<Car> car = new ArrayList<>();
        car.addAll(Arrays.asList(car1, car2, car3));
        for (Car c : car){
            c.printInfo();
        }




    }
}


class Car {

    String make;
    String model;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void printInfo() {
        System.out.println(make + " " + model);
    }
}