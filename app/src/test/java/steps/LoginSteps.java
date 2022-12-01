package steps;

import cucumber.api.java.en.*;
import pages.ChubbPage;


public class LoginSteps {

    ChubbPage chubb = new ChubbPage();

    @Given ("^The user access the Chubb sales portal$")
    public void navigateToChubb(){
        chubb.navigateToChubb();
    }

    @When ("^the user enter a valid username and password $")
    public void enterUsernamePassword(){

    }

    @And ("^click on Iniciar session button$")
    public void clickIniciarSesion(){

    }

    @Then ("^the user can see the Chubb sales menu$")
    public void openSalesMenu(){

    }
}