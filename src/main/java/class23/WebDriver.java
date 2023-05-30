package class23;

public interface WebDriver {

    /*
    Create WebDriver interface that will have the following
    unimplemented behaviour:

    openBrowser(), closeBrowser(), maximizeWindow(),findElement().
    Create 2 classes that implements WebDriver interface:
    ChromeDriver, FirefoxDriver
     */

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Chrome Browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome Browser is close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome Browser enable the max window size");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome Browser find element");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("FireFox Browser is opened");
    }

    @Override
    public void closeBrowser() {
        System.out.println("FireFox Browser is close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("FireFox Browser enable the max win size");
    }

    @Override
    public void findElement() {
        System.out.println("FireFox Browser find element");
    }


    public static void main(String[] args) {

        WebDriver[] webdriver = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : webdriver){
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
            System.out.println();
        }

    }
}




