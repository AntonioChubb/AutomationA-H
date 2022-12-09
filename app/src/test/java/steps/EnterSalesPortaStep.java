package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.WeblinkPage;

public class EnterSalesPortaStep {

    WeblinkPage weblinkPage = new WeblinkPage();

    @Given ("^the user hover over Weblink menu$")
    public void hoverOverWeblinkMenu(){
        weblinkPage.hoverWeblinkMenu();
    }

    @When ("^the user hover over option sales in list displayed$")
    public void hoverSaleList(){
        weblinkPage.hoverSalesList();
    }

    @And ("^the user click in option sales in the new list displayed$")
    public void clickSale(){
        weblinkPage.clickSaleOption();
    }

    @Then ("^user can see the Sales pages$")
    public void openCampaignMenu(){
        Assert.assertEquals("Campaign Selection", weblinkPage.campaignMenu());
    }
    
}
