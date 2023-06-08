package class27;

import org.openqa.selenium.By;
import utils.ConfigReader;
import utils.Constants;
import utils.ExcelReader;
import utils.SeleniumMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E6ExcelSelenium extends SeleniumMethods {
    public static void main(String[] args) throws IOException, InterruptedException {

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


        List<Map<String, String>> excel = ExcelReader.read("Sheet1", Constants.EXCEL_FILE_PATH);
        for (var map : excel) {
            driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            driver.findElement(By.xpath("  //a[@id='menu_pim_addEmployee']")).click();
            String firstname = map.get("FirstName");
            String middleName = map.get("MiddleName");
            String lastName = map.get("LastName");
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middleName);
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
            driver.findElement(By.xpath(" //input[@id='btnSave']")).click();

        }
    }
}