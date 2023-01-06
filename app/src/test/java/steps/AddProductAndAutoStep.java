package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddProductAndAutoStep {

    SalesPage salesPage = new SalesPage();

   
    @Given ("^the user click on Add Product icon (.+) of table campaign Availble products$")
    public void clickOnAddProductIcon(Integer icon){
        salesPage.clickAddProductIcon(icon);
    }
    
    @When ("^select (.+) of list benefit level$")
    public void selectTheBenefitLevel(String level){
        salesPage.selectBenefitLevel(level);
    }

    @And ("^fill the field with (.+), (.+), (.+), (.+) and (.+)$")
    public void enterCarDetails(String brand, String model, String tag, String VIN, String year){
       salesPage.enterBrand(brand);
       salesPage.enterModel(model);
       salesPage.enterTag(tag);
       salesPage.enterVIN(VIN);
       salesPage.enterYear(year);
    }

    @And ("^click on button Accept of new windows$") 
    public void clickOnProductAcceptButton(){
        salesPage.clickProductAcceptButton();
    }

    @Then ("^the (.+) is added to Campaign available products table$")
    public void showNewIcon(Integer newIcon){
        Assert.assertTrue("No se muestra el nuevo icono", salesPage.iconDisplayed(newIcon));
    }
}
