package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class ConfirmPaymentOptionStep {

PaymentPage paymentPage = new PaymentPage();

@When ("^the user click on the Next button$")
public void clickOnNextButton(){
    try{
        Thread.sleep(2000);
    }catch(Exception e){}
    paymentPage.clickNextButton();
}

@Then ("^the user can see the Sale confirmation page$")
public void showConfirmationSale(){
    Assert.assertEquals("Sale Confirmation", paymentPage.paymentInfoPage());
}

}