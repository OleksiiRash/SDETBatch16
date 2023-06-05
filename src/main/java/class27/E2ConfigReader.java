package class27;

import org.openqa.selenium.By;
import utils.ConfigReader;
import utils.Constants;
import utils.SeleniumMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader extends SeleniumMethods {

    public static void main(String[] args) throws IOException {

        ConfigReader.getProperties(Constants.CONFIG_READER_PATH); // ConfigReader method

        String url = ConfigReader.getProperty("URL");
        openBrowserGetURL(url, "chrome"); // SeleniumMethods method

        var username = driver.findElement(By.cssSelector("#txtUsername"));
        var configUsername = ConfigReader.getProperty("userName"); // ConfigReader method
        username.sendKeys(configUsername); // sensitive data
        var passwordField = driver.findElement(By.cssSelector("#txtPassword"));
        var configPass = ConfigReader.getProperty("password"); // ConfigReader method
        passwordField.sendKeys(configPass); // sensitive data
        var login = driver.findElement(By.cssSelector(".button"));
        login.click();

    }
}