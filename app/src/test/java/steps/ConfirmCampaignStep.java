package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CampaignPage;

public class ConfirmCampaignStep {

    CampaignPage campaignPage = new CampaignPage();

    @When ("^the user click on Sale button$")
    public void clickSalesButton(){
        campaignPage.clickSalesButton();
    }

    @Then ("^the user can see the Traditional Sale pages$")
       public void showTheSalePage(){
        Assert.assertTrue("No se muestra la pagina de ventas", campaignPage.showTheSalePage());
    }
}