package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class SelectPaymentFrequencyStep {

    PaymentPage paymentPage = new PaymentPage();

    @When ("^user can see the payment frequency section$")
    public void openSalesMenu(){
        Assert.assertTrue("No se muestra la sección Payment Frequency", paymentPage.showPaymentFrequencySection());
    }

    @Then ("^the user can choice the (.+)$")
    public void selectThePaymentFrequency(String paymentFrequency){
        paymentPage.selectPaymentFrequency(paymentFrequency);
    }
}
