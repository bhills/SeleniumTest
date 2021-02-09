package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    private WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    By Email = By.id("emailOrPhoneInput");
    By Next = By.id("signInButton");
    By Password = By.id("passwordInput");

    public By getPassword() {
        return Password;
    }

    By SignIn = By.id("signInButton");



    public void waitForPageToLoad(WebDriverWait wait ){

        wait.until(ExpectedConditions.presenceOfElementLocated(Email));
    }

    public void waitForPageToLoadPassword(WebDriverWait wait){

        wait.until(ExpectedConditions.presenceOfElementLocated(Password));
    }


    public void fillInEmail()
    {
        driver.findElement(Email).sendKeys("Brystonhills@gmail.com" );

    }

    public void fillINPassword()
    {

        driver.findElement(Password).sendKeys("seleniumtest");
    }


    public void clickSignIn(){

        driver.findElement(SignIn).click();
    }
    public void clickNext(){

        driver.findElement(Next).click();
    }






}
