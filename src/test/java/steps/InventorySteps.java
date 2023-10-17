package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InventoryPage;
import services.DriverManager;

public class InventorySteps {
    InventoryPage inventoryPage = new InventoryPage(DriverManager.getDriver());

    @Then("Se visualiza pagina principal de inventario.")
    public void completeWithUsername() {

        Assert.assertEquals("Products", inventoryPage.getTextLabelTitle());
    }

    @When("Clickear en botón 'Add to cart' de algun producto")
    public void addProduct() {
        inventoryPage.clickElementListButtonToAdd(0);
    }

    @And("Click en botón 'Remove' del producto agregado")
    public void removeProduct() {
        inventoryPage.clickElementListButtonToRemove(0);
    }
}