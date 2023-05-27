package javaOOPsProject.Task8;

public class CarTester {

    public static void main(String[] args) {

        Sedan sedan = new Sedan(35000, "red", 22);
        sedan.setCarPrice(45000);
        sedan.setColor("white");
        sedan.setLength(18);
        System.out.println("Sedan with started price " + sedan.getCarPrice() + " and color " + sedan.getColor() + " with length " + sedan.getLength() + ": final price with discount is " + sedan.calculateSalePrice());

        Truck truck = new Truck(120000, "white", 5500);
        truck.setCarPrice(150000);
        truck.setColor("red");
        truck.setWeight(6500);
        System.out.println("Truck with started price " + truck.getCarPrice() + " and color " + truck.getColor() + " with weight " + truck.getWeight() + ": final price with discount is " + truck.calculateSalePrice());


    }
}
