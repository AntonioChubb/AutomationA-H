package pages;

public class FinalPage extends BasePage {

    private String signBox = "//canvas[@id='signature-pad-proposal']";

    public FinalPage(){
        super(driver);
    }

    public void makeSign(int axeX, int axeY){
        hoverOverElementAndClick(signBox, axeX, axeY);
    }
    
}
