package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SalesPage;

public class ConfirmSaleStep {
    
    SalesPage salesPage = new SalesPage();

    @When ("^the user click on Next button$")
    public void clickOnNextButton(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
    salesPage.clickNextButton();
    }

    @Then ("^user can click on the button Quote$")
    public void clickOnQuoteButton(){
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
    salesPage.clickNextButton();
    }

    @Then ("^the user can see the Payment Info pages$")
    public void showPaymentPage(){
        Assert.assertTrue("No se muestra la página de ventas", salesPage.paymentInfoPage());
    }
}
