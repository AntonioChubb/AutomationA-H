package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CampaignPage;

public class ShowCampaignStep {
    CampaignPage campaignPage = new CampaignPage();
    
    @Given ("^the user check the option Enable Auto Search$")
    public void checkEnableAutoSearch(){
        campaignPage.checkEnableAutoSearch();
    }

    @When ("^the user select and type the campaign code in field Enter Campaign code$")
    public void enterCampaigncode(){
        campaignPage.enterCampaignCode("AR01005303");
    }

    @Then ("^the typed campaign appear in table below$")
    public void campaignInTable(){
        Assert.assertEquals("AR01005303", campaignPage.campaignMenu());
    }
}
