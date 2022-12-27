package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddDependantHolderStep {
    
    SalesPage salesPage = new SalesPage();

    @Given ("^the user click on button Add Dependant$")
    public void clickInAddDependant(){
        salesPage.clickAddDependant();
    }

    @When ("^type in field PersonalID (.+) and press enter button$")
    public void enterPolicyHolderID(String IDNumber){
        salesPage.enterPersonalID(IDNumber);
    }

    @And ("^the system fill all the required filds form and click Accept button$")
    public void clickOnAcceptButton(){
        try{
            Thread.sleep(4000);
        }catch(Exception e){}
        salesPage.clickAcceptButton();
    }

    @Then ("^the (.+) is added to the customer table$")
    public void openCampaignMenu(String name){
        Assert.assertEquals(name, salesPage.showHolderInTable(name));
    }
}