package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CampaignPage;

public class SelectCampaignStep {

    CampaignPage campaignPage = new CampaignPage();
    
     @Given ("^the user click on (.+) in table$")
    public void clickCampaignInTable(String campaignCode){
        campaignPage.clickCampaignInTable(campaignCode);
    }

    @Then ("^the button the Sale button is enabled$")
    public void enabledSaleButton(){
        Assert.assertTrue("No se habilita el botón", campaignPage.saleButtonEnabled());
    }
}
