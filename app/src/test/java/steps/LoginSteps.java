package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.LoginChubbPage;


public class LoginSteps {

    LoginChubbPage loginchubb = new LoginChubbPage();

    @Given ("^The user access the Chubb sales portal$")
    public void navigateToChubb(){
        loginchubb.navigateToChubb(); 
    }

    @When ("^the user enter a valid username and password$")
    public void enterUsernamePassword(){
        loginchubb.enterUsername("antonio.montilla@logicstudio.net");
        loginchubb.enterPassword("Tonito92197.");
    }

    @And ("^click on Iniciar session button$")
    public void clickIniciarSesion(){
        loginchubb.clickChubbLogin();
    }

    @Then ("^the user can see the Chubb sales menu$")
    public void openSalesMenu(){
        Assert.assertEquals("Texto que", loginchubb.firstResult());
    }
}