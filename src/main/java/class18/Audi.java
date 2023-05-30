package class18;

public class Audi extends Vehicle {  // only once class should be public

    class BMW extends Vehicle {

        void offerMpackage() {
            System.out.println("Only BMW offers the M package");
        }
    }

    class Honda extends Vehicle {

    }

    public static void audiEngineMode() {
        System.out.println("Audi Start-Stop Engine mode is On");
    }

    public static void main(String[] args) {

        Vehicle obj = new Vehicle();
        System.out.println(obj.make = "Audi".concat(obj.model = " Q7"));
        Audi.audiEngineMode();
        obj.startCar();


    }
}
