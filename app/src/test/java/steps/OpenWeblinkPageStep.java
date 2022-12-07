package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ChubbPage;

public class OpenWeblinkPageStep {

    ChubbPage chubbpage = new ChubbPage();
    
    @When ("^the user click on Weblink link$")
    public void clickWeblinkLink(){
        chubbpage.clickWeblinkLink();
    }


    @Then ("^the user can see the Weblink pages$")
    public void openWeblinkPage(){
        Assert.assertEquals("Texto esperado", chubbpage.weblinkResult());
    }
}
