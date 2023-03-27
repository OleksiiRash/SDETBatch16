package class4.homework_class4;

import java.util.Scanner;

public class Task4ScannerCityTemp {
    public static void main(String[] args) {

        /*
        Task 4: Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print “The temperature in
        the city __ is __”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("What Is Your City?");
        String city = scan.nextLine();
        System.out.println("What Is Your Temperature?");
        double temperatureF = scan.nextDouble();
        // To convert temperatures in Fahrenheit to Celsius, subtract 32 and multiply by 0.5556
        int temperatureC = (int) ((temperatureF-32)*0.5556);

        System.out.println("The temperature in the city " + city + " is " + temperatureC + " °C");

    }
}
