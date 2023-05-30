package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList <Character> characters  = new ArrayList<>();
        characters.addAll(Arrays.asList('D', 'E', 'W'));
        System.out.println(characters);
        System.out.println(characters.indexOf('E'));
        System.out.println(characters.contains('W'));
        System.out.println(characters.isEmpty());
        characters.set(1, 'M'); // replace the character
        System.out.println(characters);



    }
}
