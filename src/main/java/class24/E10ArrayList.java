package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class E10ArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");
        names.add("coffee");
        names.add("Water");
        names.add("juice");

        names.removeIf(name -> name.endsWith("e")); // instead of name we can pass any variable name that we want

/*
        Iterator<String> iterator = names.iterator(); // we are calling the object of the iterator
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.endsWith("e")) {
                iterator.remove();
            }
        }
 */

        System.out.println(names);
    }
}
