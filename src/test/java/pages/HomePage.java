package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class HomePage {
    static WebDriver driver;

    By inputUserName = By.id("user-name");
    By inputPassword = By.id("password");
    By buttonLogin = By.id("login-button");

    By dataTestError = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }
    public void sendKeysInputUsername(String username){
        driver.findElement(inputUserName).sendKeys(username);
    }

    public void sendKeysInputPassword(String username){
        driver.findElement(inputPassword).sendKeys(username);

    }

    public void clickLogin(){
        driver.findElement(buttonLogin).click();
    }

    public String getDataTestError(){
        return driver.findElement(dataTestError).getText();
    }
}
