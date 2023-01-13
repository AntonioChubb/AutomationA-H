package steps;


import cucumber.api.java.en.Then;
import pages.PaymentPage;

public class SelectBorderouxPaymentMethodStep {

    PaymentPage paymentPage = new PaymentPage();

    @Then ("^the user select the collector (.+)$")
    public void selectTheCollector(String collector){
        paymentPage.selectCollector(collector);
    }
    
}
