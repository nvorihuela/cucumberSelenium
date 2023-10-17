package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import services.DriverManager;

public class LoginSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());

    @When("^Completar campo username con usuario: '(.*)'$")
    public void completeWithUsername(String username) {
        System.out.println("Complete Login with user: " + username);
        homePage.sendKeysInputUsername(username);
    }

    @When("^Completar campo Password con contraseña: '(.*)'$")
    public void userCompleteWithPasswordPassword(String password) {
        System.out.println("Complete Login with password: " + password);
        homePage.sendKeysInputPassword(password);
    }

    @And("User click button \"Login\"")
    public void userClickButtonLogin() {
        homePage.clickLogin();
    }

    @Then("Se muestra mensaje de validación: '(.*)'$")
    public void seMuestraMensajeDeValidaciónMessage(String msg) {

        Assert.assertEquals(msg,homePage.getDataTestError());
    }

}
