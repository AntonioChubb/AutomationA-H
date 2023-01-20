package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class SelectPaymentFrequencyStep {

    PaymentPage paymentPage = new PaymentPage();

    @When ("^user can see the payment frequency section$")
    public void openSalesMenu(){
        Assert.assertTrue("No se muestra la sección Payment Frequency", paymentPage.showPaymentFrequencySection());
    }

    @When ("^user select the option (.+) of list$")
    public void selectTheQuotePaymentFrequency(String quotePaymentFrequency){
        paymentPage.selectQuotePaymentFrequency(quotePaymentFrequency);
    }

    @And ("^press the Accept button$")
    public void clickTheAcceptQuoteButton(){
        paymentPage.clickQuoteAcceptButton();
    }

    @Then ("^the user can choice the (.+)$")
    public void selectThePaymentFrequency(String paymentFrequency){
        paymentPage.selectPaymentFrequency(paymentFrequency);
    }
}
