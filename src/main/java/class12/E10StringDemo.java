package class12;

public class E10StringDemo {
    public static void main(String[] args) {

        String name = "Zackk";

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'k') {
                count++; // we just count, not perform the sum operation
            }
        }
        System.out.println(count);


    }
}
