package driverclass;

import org.openqa.selenium.WebDriver;

public class DriverClass {

    private WebDriver driver;

    public DriverClass() {
    }

    public void ChromeDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
    }
}
