package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getProperties(String path) throws IOException {
        var fis = new FileInputStream(path);
        var properties = new Properties();
        properties.load(fis);
        return properties;

    }

    public static String getProperty(String key) throws IOException {
        var properties = getProperties(Constants.CONFIG_READER_PATH);
        return properties.getProperty(key);
    }

}

