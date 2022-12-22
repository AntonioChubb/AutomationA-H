package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddPolicyHolderStep {
    
    SalesPage salesPage = new SalesPage();

    @Given ("^the user click on button Add Policy holder$")
    public void clickInAddPolicyHolder(){
        salesPage.clickAddPolicyHolder();
    }

    @When ("^type in field Personal ID a valid ID number and press enter button in keyboard$")
    public void enterPolicyHolderID(){
        salesPage.enterPersonalID("17459844");
    }

    @And ("^the system fill all the required filds of form and click on Accept button$")
    public void clickOnAcceptButton(){
        try{
            Thread.sleep(6000);
        }catch(Exception e){}
        salesPage.clickAcceptButton();
    }

    @Then ("^the policy holder is added to tradicional sale customer table$")
    public void openCampaignMenu(){
        Assert.assertEquals("MARIA ALBA URRISTE", salesPage.showHolderInTable());
    }
}
