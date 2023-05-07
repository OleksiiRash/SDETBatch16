package class17.homework_class17;

public class Task3_Static {

    static int count;

    // There is no concept of a static constructor, but we can use a static initialization block.
    static {
        System.out.println("Static initialization block");
        count = 0;
    }

    public Task3_Static() {
        count++;
    }

    public static void main(String[] args) {

        Task3_Static obj1 = new Task3_Static();
        Task3_Static obj2 = new Task3_Static();
        System.out.println("Number of objects created: " + count);
    }

}
