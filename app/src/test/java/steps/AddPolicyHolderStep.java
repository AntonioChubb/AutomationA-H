package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddPolicyHolderStep {
    
    SalesPage salesPage = new SalesPage();

    @Given ("^the user click on button (.+)$")
    public void clickInAddPolicyHolder(String button){
        salesPage.clickAddPolicyHolder(button);
    }

    @When ("^type in field Personal ID (.+) and press enter button in keyboard$")
    public void enterPolicyHolderID(String IDNumber){
        salesPage.enterPersonalID(IDNumber);
    }

    @And ("^the system fill all the required filds of form and click on Accept button$")
    public void clickOnAcceptButton(){
        try{
            Thread.sleep(4000);
        }catch(Exception e){}
        salesPage.clickAcceptButton();
    }

    @Then ("^the (.+) is added to tradicional sale customer table$")
    public void openCampaignMenu(String name){
        Assert.assertEquals(name, salesPage.showHolderInTable(name));
    }
}
