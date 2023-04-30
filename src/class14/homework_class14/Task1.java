package class14.homework_class14;

import com.sun.tools.javac.Main;

public class Task1 {

/*
Task1:
Create a method that will say Hello in different language
based on the country that will be passed when method is executed.
 */

    String lang(String country) {
        if (country.equalsIgnoreCase("Spain")) {
            country = "Hola";
        } else if (country.equalsIgnoreCase("USA")) {
            country = "Hello";
        } else {
            country = "Error";
        }
        return country;
    }

    public static void main(String[] args) {

        Task1 obj = new Task1();
        String country = "germany";
        String result = obj.lang(country);
        System.out.println(result);


    }
}
