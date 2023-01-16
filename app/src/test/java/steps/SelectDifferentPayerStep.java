package steps;

import cucumber.api.java.en.Then;
import pages.PaymentPage;

public class SelectDifferentPayerStep {

    PaymentPage paymentPage = new PaymentPage();

    @Then ("^the user check the box Policy Payer is different than Policy Holder$")
    public void checkADifferentPayer(){
        paymentPage.checkDifferentPayer();
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
    }
    
}
