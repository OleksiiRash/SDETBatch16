package class28;

import org.openqa.selenium.By;
import utils.SeleniumMethods;

public class E10Finally extends SeleniumMethods {
    public static void main(String[] args) {

        String path = "https://www.google.com/";

        try {
            openBrowserGetURL(path, "chrome");
            driver.findElement(By.xpath("sdsdsdsdsdsd"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            closeBrowser();
        }


    }
}
