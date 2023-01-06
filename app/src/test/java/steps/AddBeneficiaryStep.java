package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddBeneficiaryStep {

    SalesPage salesPage = new SalesPage();
    
    

    @Given ("^the user click on Add Beneficiary (.+) icon of table campaign Availble products$")
    public void clickOnAddBeneficiaryIcon(String icon){
        salesPage.clickAddBeneficiaryIcon(icon);
    }

    @When ("^click on Add Beneficiary Button$")
    public void clickOnAddBeneficiaryButton(){
        salesPage.clickAddBeneficiaryButton();
    }

    @And ("^fill the field with name (.+) and percentage (.+)$")
    public void enterNameAndPercentage(String name, String percentage){
        salesPage.enterBeneficiaryName(name);
        salesPage.enterBeneficiaryPercentage(percentage);
    }

    @And ("^Select the relationship (.+)$")
    public void selectTheRelationship(String relationship){
        salesPage.selectRelationship(relationship);
    }

    @And ("^click on button Save Benneficiary$") 
    public void clickOnSaveTheBeneficiaryButton(){
        salesPage.clickSaveBeneficiaryButton();
    }

    @And ("^the benneficiary (.+) is added to Manage Beneficiary table$")
    public void showTheBeneficiaryInTable(String beneficiary){
        Assert.assertEquals(beneficiary, salesPage.showBeneficiaryInTable(beneficiary));
    }

    @Then ("^the user click on close button of Manage Beneficiary table$")
    public void clickOnCloseButton(){
        salesPage.clickCloseButton();
    }
}
