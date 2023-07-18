package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import services.DriverManager;

import java.sql.Driver;

public class CommonSteps {

    @Given("^User navigate to: '(.*)'$")
    public void openBrowser(String url){
        DriverManager.getDriver().navigate().to(url);
    }

}
