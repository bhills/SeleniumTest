package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForPageToLoad(WebDriverWait wait ){

        wait.until(ExpectedConditions.presenceOfElementLocated(InboxMessenger));
    }

    By InboxMessenger = By.id("navigate-to-messenger");
    By NewMessage = By.id("selenium-send-review-invite-button");
    By NameInput = By.id("firstInput");
    

    public By getInboxMessenger() {
        return InboxMessenger;
    }


}
