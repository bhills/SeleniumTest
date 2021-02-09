package seleniumtests;
import POM.HomePage;
import POM.LoginPage;
import cucumber.api.java.hu.De;
import cucumber.api.java.sl.In;
import driverclass.DriverClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;

public class SeleniumTest {



    private WebDriver driver;
    private WebDriverWait wait;
    public SeleniumTest() {
    }


    @BeforeEach
    public void LoginCredentials()
    {

        DriverClass driverClass = new DriverClass();
        driverClass.ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://www.podium.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillInEmail();
        loginPage.clickNext();
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(loginPage.getPassword()));
        loginPage.fillINPassword();
        loginPage.clickSignIn();


    }

    @DisplayName("Test: 1 Login Test")
    @Test
    public void LoginTest()
    {

        HomePage homePage = new HomePage(driver);
        homePage.waitForPageToLoad(wait);
        boolean inboxMessenger = driver.findElement(homePage.getInboxMessenger()).isDisplayed();
        assert(inboxMessenger);

    }



    @AfterEach
    public void closeDriver()
    {
        driver.quit();
    }
}
