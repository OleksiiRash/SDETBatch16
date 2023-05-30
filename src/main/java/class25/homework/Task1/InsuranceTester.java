package class25.homework.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class InsuranceTester {

    public static void main(String[] args) {

        ArrayList<Insurance> policies = new ArrayList<>(Arrays.asList(new Car(), new Pet(), new Health()));
        for (Insurance i : policies) {
            if (i instanceof Car) {
                Car carInsurance = (Car) i;
                carInsurance.setInsuranceName("USAA");
                carInsurance.setBrand("Toyota");
                carInsurance.setModel("Camry");
                carInsurance.cancelInsurance();
                System.out.println(carInsurance.getQuote() + " Quote" + " for" + " " + carInsurance.getBrand() + " " + carInsurance.getModel());
            } else if (i instanceof Pet) {
                Pet petInsurance = (Pet) i;
                petInsurance.setInsuranceName("USAA");
                petInsurance.setPetType("Dog");
                petInsurance.cancelInsurance();
                System.out.println(petInsurance.getQuote() + " Quote" + " for" + " " + petInsurance.getPetType());
            } else if (i instanceof Health) {
                Health hInsurance = (Health) i;
                hInsurance.cancelInsurance();
                System.out.println(hInsurance.getQuote() + " Quote" + " for Health Insurance");
            } else {
                i.setInsuranceName("USAA");
                i.cancelInsurance();
                System.out.println(i.getQuote());

            }
        }

    }
}
