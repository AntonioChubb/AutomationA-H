package steps;

import cucumber.api.java.en.Then;
import pages.PaymentPage;

public class AddExpirationDateStep {
    
    PaymentPage paymentPage = new PaymentPage();

    @Then ("^the user type the expiration date (.+)$") 
    public void addExpirationDate(String expirationDate){
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        paymentPage.writeExpirationDate(expirationDate);
    }
}
