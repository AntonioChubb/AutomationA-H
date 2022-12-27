package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FinalPage;

public class FinalSaleStep {
    
    FinalPage finalPage = new FinalPage();


    @When ("^the user click in button confirm sale$")
    public void clickTheConfirmButton(){
        finalPage.clickConfirmSale();
    }

    @Then ("^Appear the Sale Result page$")
    public void showSaleResult(){
        Assert.assertEquals("Sale Result", finalPage.saleResultPage());
    }
}
