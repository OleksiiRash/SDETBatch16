package class9;

public class E7Arrays {
    public static void main(String[] args) {

        boolean[] flags = {true, false, true, false, false};

        int count = 0;
        for (int i = 0; i < flags.length; i++) { //
            if (flags[i] == false) { // means false, if we delete ! we need to remove ! and it will be true
                // as well we can use instead of this flags[i] == false, we can use this one if (!flags[i])
                count++; // counter that will increase the false amount, and we will know how many false
            }
        }

        System.out.println("Number of false values: " + count);


    }
}
