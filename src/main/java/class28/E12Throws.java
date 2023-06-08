package class28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Throws {
    public static void main(String[] args) {

        try {
            print();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    static void print() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("sdsdsdsd");
    }
}
