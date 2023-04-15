package class11;

public class E7D2Array {

    public static void main(String[] args) {

        boolean[][] data = {

                {true, false, true, true, false},
                {true, false, false, false, false},
        };

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j]) {
                    System.out.println(data[i][j] + " ");
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
