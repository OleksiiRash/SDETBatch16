package class26;

import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        //System.out.println(System.currentTimeMillis());
        //String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        System.out.println(Constants.CONFIG_READER_PATH);
        FileInputStream fileInputStream = new FileInputStream(Constants.CONFIG_READER_PATH); // navigate to the file
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName" + ""));

    }
}
