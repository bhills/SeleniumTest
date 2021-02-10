package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    By FirstName = By.id("input-signup-firstName");
    By LastName = By.id("input-signup-lastName");
    By MobileNumber = By.id("input-signup-phone");
    By BusinessName = By.id("input-signup-businessName");
    By WorkEmail = By.id("input-signup-email");
    By Password = By.id("input-signup-password");
    By CreateAccount = By.id("create-account-next-btn");

    public By getCreateAccount() {
        return CreateAccount;
    }

    public By getFirstName() {
        return FirstName;
    }


    public void waitForPageToLoad()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(FirstName));
    }


    public void fillInFirstName()
    {
        driver.findElement(FirstName).sendKeys("Bryston");
    }

    public void fillInLastName()
    {
        driver.findElement(LastName).sendKeys("Hills");
    }

    public void fillInMobile()
    {
        driver.findElement(MobileNumber).sendKeys("8018888888");
    }

    public void fillInBusinessName()
    {
        driver.findElement(BusinessName).sendKeys("PMIwerf");
    }

    public void fillInWorkEmail()
    {
        driver.findElement(WorkEmail).sendKeys("Brystonhillls@gmail.com");
    }

    public void fillInPassword()
    {
        driver.findElement(Password).sendKeys("seleniumtest");
    }

    public void clickCreateAccount()
    {
        //driver.findElement(CreateAccount).click();
    }

}
