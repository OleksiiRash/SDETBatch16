package class16.homework_class16;

import org.w3c.dom.ls.LSOutput;

public class Task2_C16 {

/*
Task 2:
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is naming
*/

    String vowels(String input){
        String iVowels = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (String.valueOf(c).matches("[aeiouAEIOU]")) {
                iVowels += c;
            }
        }
        return iVowels;
    }

    public static void main(String[] args) {

        Task2_C16 obj = new Task2_C16();
        String result = obj.vowels("Hello World");
        System.out.println(result);

    }
}
