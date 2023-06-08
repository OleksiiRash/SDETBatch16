package class28;

import utils.Constants;

import java.io.FileInputStream;

public class E6Exceptions {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("Files/Employees.xlsx");
        } catch (Exception file) {
            System.out.println(file.getMessage());
        }




    }
}
