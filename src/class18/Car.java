package class18;

public class Car {

    String make;
    String model;
    String color;
    int year;
    int engineCC;

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Car(String make, String model, String color, int year) {
        this(make, model, color);
        this.year = year;
    }

    public Car(String make, String model, String color, int year, int engineCC) {
        this(make, model, color, engineCC);
        this.engineCC = engineCC;
    }

    static void startCar() {
        System.out.println("Car started");
    }

    static void stopCar() {
        System.out.println("Car stopped");
    }

}


