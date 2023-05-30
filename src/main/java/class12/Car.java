package class12;

public class Car {

    String brand;
    String model;
    String color;
    int mileage;
    boolean isAutomatic;

    void startCar() {
        System.out.println("Starting " + model + " .....");
    }

    void stopCar() {
        System.out.println("Applying the brakes to stop the car");
    }

    void turn() {
        System.out.println("turning.....");
    }


}
