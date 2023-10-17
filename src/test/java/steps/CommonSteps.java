package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import services.DriverManager;

import java.sql.Driver;

public class CommonSteps {

    @Given("^Abrir navegador en la página: '(.*)'$")
    public void openBrowser(String url){
        DriverManager.getDriver().navigate().to(url);
    }

}
