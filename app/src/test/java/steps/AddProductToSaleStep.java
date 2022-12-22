package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddProductToSaleStep {
    
    SalesPage salesPage = new SalesPage();

    @Given ("^the user click on plus page icon of table campaign Availble products$")
    public void clickOnAddProductIcon(){
        salesPage.clickAddProductIcon();
    }

    @When ("^select an item of list benefit level$")
    public void selectTheBenefitLevel(){
        salesPage.selectBenefitLevel("Nivel 200.000");
    }

    @And ("^click on button Accept$")
    public void clickOnProductAcceptButton(){
        salesPage.clickProductAcceptButton();
    }

    @Then ("^the product is added to Campaign available products$")
    public void showNewIcon(){
        Assert.assertTrue("No se muestra el nuevo icono", salesPage.iconDisplayed());
    }
}
