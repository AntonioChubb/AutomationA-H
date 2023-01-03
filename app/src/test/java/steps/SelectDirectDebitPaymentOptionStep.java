package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class SelectDirectDebitPaymentOptionStep {

    PaymentPage paymentPage = new PaymentPage();

    @When ("^user click on Direct Debit Option$")
    public void selectTheDirectDebitOption(){
        paymentPage.selectDirectDebitOption();
    }
    
    @And ("^Select (.+) from the list$")
    public void selectTheBank(String bank){
        try{
            Thread.sleep(4000);
        }catch(Exception e){}
        paymentPage.selectBank(bank);
    }

    @And ("^Enter the (.+)$")
    public void enterCreditcardNumberAndSecurityCode(String accountNumber){
        try{
            Thread.sleep(4000);
        }catch(Exception e){}
        paymentPage.switchToIFrame(0);
        paymentPage.enterAccountNumber(accountNumber);
        paymentPage.exitIFrame();
    }

    @Then ("^Select the (.+) that prefer$")
    public void selectTheDebitDay(String debitDay){
        try{
            Thread.sleep(4000);
        }catch(Exception e){}
        paymentPage.selectDebitDay(debitDay);
    }
}
