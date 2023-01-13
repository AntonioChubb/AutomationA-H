package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class GiroPaymentOptionsStep {

    PaymentPage paymentPage = new PaymentPage();

    @Given ("^the user select the giro collector (.+) option$")
    public void selectGiroCollector(String collector){
        paymentPage.selectGiroCollector(collector);
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
    }

    @When ("^select the (.+) bank from list$")
    public void selectGiroBank(String bank){
        paymentPage.selectGiroBank(bank);
    }

    @And ("^type branch (.+) and select the first item of list$")
    public void typeGiroBranch(String giroBranch){
        paymentPage.typeGiroBranch(giroBranch);
    }

    @Then ("^type the account number (.+)$")
    public void typeGiroAccountNumber(String giroAccountNumber){
        paymentPage.switchToIFrame(0);
        paymentPage.typeGiroAccountNumber(giroAccountNumber);
        paymentPage.exitIFrame();
    }
    
}
