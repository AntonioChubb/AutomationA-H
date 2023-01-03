package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class PaymentOptionsStep {

PaymentPage paymentPage = new PaymentPage();

@When ("^select the credit card type$")
public void selectTheCreditCardType(){
    paymentPage.selectCreditCardType("AR - VISA");
}

@And ("^choice the month and expiration date year$")
public void selectTheBenefitLevel(){
    paymentPage.selectCreditCardMonth("6");
    paymentPage.selectCreditCardYear("2025");
}

@Then ("^type the credit card number and security code$")
public void enterCreditcardNumberAndSecurityCode(){
    paymentPage.switchToIFrame(0);
    paymentPage.enterCardNumber("4143766247546688");
    paymentPage.exitIFrame();
    paymentPage.enterSecurityCode("656");   
}

}