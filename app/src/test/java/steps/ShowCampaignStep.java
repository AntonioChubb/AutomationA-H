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
        try{
            Thread.sleep(3000);
        }catch(Exception e){}
    }

    @When ("^the user select and type the campaign (.+) in field Enter Campaign code$")
    public void enterCampaigncode(String campaignCode){
        campaignPage.enterCampaignCode(campaignCode);
        try{
            Thread.sleep(3000);
        }catch(Exception e){}
    }

    @Then ("^the typed (.+) appear in table below$")
    public void campaignInTable(String campaignCode){
        Assert.assertEquals(campaignCode, campaignPage.campaignMenu(campaignCode));
    }
}