package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class AddNewHolderStep {

    SalesPage salesPage = new SalesPage();
    
    @When ("^type in field Personal ID (.+) and press the tab button in keyboard$")
    public void enterTheNewPersonalID(String newPersonalID){
        salesPage.enterNewPersonalID(newPersonalID);
    }

    @And ("^fill the firstname filed with name (.+)$")
    public void enterTheNewHolderName(String newHolderName){
        try{
            Thread.sleep(6000);
        }catch(Exception e){}
        salesPage.enterNewHolderName(newHolderName);
    }

    @And ("^fill last name field with name (.+)$")
    public void enterTheNewHolderLastname(String newHolderLastname){
        salesPage.enterNewHolderLastname(newHolderLastname);
    }

    @And ("^fill birth date field with date (.+)$")
    public void enterTheNewHolderBirthdate(String newHolderBirthdate){
        salesPage.enterNewHolderBirthdate(newHolderBirthdate);
    }

    @And ("^fill e-mail field with email (.+)$")
    public void enterTheNewHolderEmail(String newHolderEmail){
        salesPage.enterNewHolderMail(newHolderEmail);
    }

    @And ("^Select the option (.+) from sex list$")
    public void selectTheNewHolderSex(String newHolderSex){
        salesPage.selectNewHolderSex(newHolderSex);
    }

    @And ("^Click in chekbox Home$")
    public void checkHome(){
        salesPage.MarkHomeCheckbox();
    }

    @And ("^fill the address1 field with address (.+)$")
    public void enterTheNewHolderAddress(String newHolderAddress){
        salesPage.enterNewHolderAddress1(newHolderAddress);
    }

    @And ("^Select the province (.+) from provinces list$")
    public void selectTheNewHolderProvince(String newHolderProvince){
        salesPage.selectNewHolderProvince(newHolderProvince);
    }

    @And ("^Fill the city field with city (.+)$")
    public void enterTheNewHolderCity(String newHolderCity){
        salesPage.enterNewHolderCity(newHolderCity);
    }

    @Then ("^the (.+) and (.+) is added to tradicional sale customer table$")
    public void VerifypersonAdded(String name, String lastname){
        String newName =name+" "+lastname ;
        Assert.assertEquals(newName, salesPage.showHolderInTable(newName));
    }
}
