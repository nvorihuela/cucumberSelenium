package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class InventoryPage {
    static WebDriver driver;

    By labelTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By buttonAddToCart = By.xpath("//button[contains(text(),'Add to cart')]");
    By buttonRemoveToCart = By.xpath("//button[contains(text(),'Remove')]");
    By linkCartBage = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }
    public String getTextLabelTitle(){
        return driver.findElement(labelTitle).getText();
    }
    public List<WebElement> getElementsButtonAdd(){return driver.findElements(buttonAddToCart);

    }
    public void clickElementListButtonToAdd(int i){
        List<WebElement> buttons = getElementsButtonAdd();
        buttons.get(i).click();
    }

    public List<WebElement> getElementsButtonRemove(){return driver.findElements(buttonRemoveToCart);

    }
    public void clickElementListButtonToRemove(int i){
        List<WebElement> buttons = getElementsButtonRemove();
        buttons.get(i).click();
    }

    public String getTextElementListButtonToAdd(int i){
        List<WebElement> buttons = getElementsButtonAdd();
        return buttons.get(i).getText();
    }
    public String getTextElementListButtonToRemove(int i){
        List<WebElement> buttons = getElementsButtonRemove();
        return buttons.get(i).getText();
    }

    public void clickCart(){
        driver.findElement(linkCartBage).click();

    }

    public Boolean getLinkCartBageExist(){
        try {
            driver.findElement(linkCartBage);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
