package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.ChubbPage;


public class LoginSteps {

    ChubbPage chubb = new ChubbPage();

    @Given ("^The user access the Chubb sales portal$")
    public void navigateToChubb(){
        chubb.navigateToChubb(); 
    }

    @When ("^the user enter a valid username and password$")
    public void enterUsernamePassword(){
        chubb.enterUsername("antonio.montilla@logicstudio.net");
        chubb.enterPassword("Tonito92197.");
    }

    @And ("^click on Iniciar session button$")
    public void clickIniciarSesion(){
        chubb.clickChubbLogin();
    }

    @Then ("^the user can see the Chubb sales menu$")
    public void openSalesMenu(){
        Assert.assertEquals("Texto que", chubb.firstResult());
    }
}