package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import services.DriverManager;

public class LoginSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());

    @When("^User login with user: '(.*)'$")
    public void completeWithUsername(String username) {
        System.out.println("Complete Login with user: " + username);
        homePage.sendKeysInputUsername(username);
    }

    @When("^User complete with password: '(.*)'$")
    public void userCompleteWithPasswordPassword(String password) {
        System.out.println("Complete Login with password: " + password);
        homePage.sendKeysInputPassword(password);
    }

    @And("User click button \"Login\"")
    public void userClickButtonLogin() {
        homePage.clickLogin();
    }
}
