package class22;

public class FileTester {
    public static void main(String[] args) {

        File[] files = {new JavaFile("Animals", 5.6), new PdfFile("Dog", 4.0), new WordFile("cat", 6.2)};
        for (File f : files) {
            f.printInfo();
            f.open();
            f.edit();
            f.close();
            System.out.println();
        }


    }
}