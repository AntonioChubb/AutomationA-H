package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class PaymentOptionsStep {

PaymentPage paymentPage = new PaymentPage();

/*@When ("^the user select a payment frequency$")
public void selectThePaymentFrequency(){
    paymentPage.selectPaymentFrequency("Monthly");
}
*/

@When ("^select the credit card type$")
public void selectTheCreditCardType(){
    paymentPage.selectCreditCardType("AR - VISA");
}

@And ("^choice the month and year of expiration date$")
public void selectTheBenefitLevel(){
    paymentPage.selectCreditCardMonth("6");
    paymentPage.selectCreditCardYear("2025");
}

@And ("^type the credit card number and security code$")
public void enterCreditcardNumberAndSecurityCode(){
    paymentPage.switchToIFrame(0);
    paymentPage.enterCardNumber("4143766247546688");
    paymentPage.exitIFrame();
    paymentPage.enterSecurityCode("656");   
}

@And ("^the user can click on the Next button$")
public void clickOnNextButton(){
    paymentPage.clickNextButton();
}

@Then ("^the user can see the Sale confirmation page$")
public void showConfirmationSale(){
    Assert.assertEquals("Sale Confirmation", paymentPage.paymentInfoPage());
}

}