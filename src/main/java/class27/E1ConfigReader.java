package class27;

import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(path);
        System.out.println(Constants.CONFIG_READER_PATH);
        //Brings the data from the file in the form of bytes
        var fis = new FileInputStream(Constants.CONFIG_READER_PATH);
        // converts the data in the form of key value pairs
        var prop = new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));



    }
}
