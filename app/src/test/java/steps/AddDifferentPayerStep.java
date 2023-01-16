package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.PaymentPage;

public class AddDifferentPayerStep {

    PaymentPage paymentPage = new PaymentPage();

    @Given ("^the user fill the Personal ID field with (.+)$")
    public void typeThePayerID(String payerID){
        paymentPage.typePayerID(payerID);
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
    }

    @When ("^fill the name field with (.+)$")
    public void typeThePayerName(String payerName){
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        paymentPage.typePayerName(payerName);
    }

    @And ("^fill the lastname field with (.+)$")
    public void typeThePayerLastname(String payerLastname){
        paymentPage.typePayerLastname(payerLastname);
    }

    @And ("^fill the birthdate field with (.+)$")
    public void typeThePayerBirthdate(String payerBirthdate){
        paymentPage.typePayerBirthdate(payerBirthdate);
    }

    @And ("^Select the sex (.+) from the policy payer dropdown list$")
    public void selectThePayerSex(String payerSex){
        paymentPage.selectPayerSex(payerSex);
    }

    @And ("^type the (.+) in field address1$")
    public void typeThePayerAddress1(String payerAddress1){
        paymentPage.typePayerAddress1(payerAddress1);
    }

    @And ("^select the province (.+) from the list$")
    public void selectThePayerProvince(String payerProvince){
        paymentPage.selectPayerProvince(payerProvince);
    }

    @And ("^type the home city (.+) from user$")
    public void typeThePayerCity(String payerCity){
        paymentPage.typePayerCity(payerCity);
    }
}