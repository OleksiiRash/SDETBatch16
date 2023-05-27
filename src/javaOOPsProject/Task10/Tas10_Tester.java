package javaOOPsProject.Task10;

import class10.projectHW.Task10;
import class21.homework_class21.*;

public class Tas10_Tester {

    public static void main(String[] args) {

        RemoteWebDriver[] webDriver = {
                new ChromeDriver(),
                new FirefoxDriver(),
                new SafariDriver(),
        };

        for (RemoteWebDriver w : webDriver) {
            w.open();
            w.close();
            System.out.println(w.getTitle());
            w.getScreenshot();
            w.navigate();
            System.out.println();
        }

    }
}
