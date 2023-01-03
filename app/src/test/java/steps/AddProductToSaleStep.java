package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddProductToSaleStep {
    
    SalesPage salesPage = new SalesPage();

    @Given ("^the user click on plus page (.+) of table campaign Availble products$")
    public void clickOnAddProductIcon(Integer icon){
        salesPage.clickAddProductIcon(icon);
    }

    @When ("^select an (.+) of list benefit level$")
    public void selectTheBenefitLevel(String level){
        salesPage.selectBenefitLevel(level);
    }

    @And ("^click on button Accept$")
    public void clickOnProductAcceptButton(){
        salesPage.clickProductAcceptButton();
    }

    @Then ("^the (.+) is added to Campaign available products$")
    public void showNewIcon(Integer newIcon){
        Assert.assertTrue("No se muestra el nuevo icono", salesPage.iconDisplayed(newIcon));
    }
}
