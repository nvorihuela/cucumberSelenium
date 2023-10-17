package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {
    private static DriverManager DriverManager;
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;

    public DriverManager() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\Drivers\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\Drivers\\msedgedriver.exe");
        //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\Drivers\\geckodriver.exe");
        //driver = new FirefoxDriver();

        driver = new ChromeDriver();
        //driver = new EdgeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void setUpDriver() {
        if (DriverManager==null) {
            DriverManager = new DriverManager();
        }


    }
    public static void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
        DriverManager = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
