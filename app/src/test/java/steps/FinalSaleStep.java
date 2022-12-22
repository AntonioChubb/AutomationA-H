package steps;

import cucumber.api.java.en.When;
import pages.FinalPage;

public class FinalSaleStep {
    
    FinalPage finalPage = new FinalPage();


    @When ("^the user make the Sign$")
    public void makeTheSign(int axeX, int axeY){
        finalPage.makeSign(20, 20);
    }
}
