package steps;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import services.DriverManager;

public class Hooks {

    @Before
    public static void setUp() {

        DriverManager.setUpDriver();
    }

    @After
    public static void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        DriverManager.tearDown();
    }
   /* public static void configBrowser(String browser) {

        System.out.println("Set up driver for: "+ browser);

        switch (browser)
        {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "..\\cucumberTest\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
    }

    public static void navigateTo(String url) {
        driver.navigate().to(url);
    }*/
}
