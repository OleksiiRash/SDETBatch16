package class15;

public class Test {
    void numbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        Test obj = new Test();
        obj.numbers(0, 10);

    }
}
