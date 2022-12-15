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
        loginchubb.enterUsername("dmosquera1973@gmail.com");
        loginchubb.enterPassword("Chubb123456$");   
    }

    @And ("^click on Iniciar session button$")
    public void clickIniciarSesion(){
        loginchubb.clickChubbLogin();
    }

    @Then ("^the user can see the Chubb sales menu$")
    public void openSalesMenu(){
        Assert.assertTrue("No se muestra el enlace Weblink", loginchubb.firstResult());
    }
}