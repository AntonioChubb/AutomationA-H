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

    @When ("^the user click on Quote button$")
    public void clickQuoteButton(){
        campaignPage.clickQuoteButton();
    }

    @Then ("^the user can see the Traditional Sale pages$")
       public void showTheSalePage(){
        Assert.assertTrue("No se muestra la pagina de ventas", campaignPage.showTheSalePage());
    }

    @Then ("^the user can see the Quote Page$")
    public void showTheQuotePage(){
        Assert.assertTrue("No se muestra la pagina de cotizaciones", campaignPage.showTheSalePage());
    }

}