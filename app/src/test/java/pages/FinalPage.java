package pages;

public class FinalPage extends BasePage {

    private String confirmSaleButton = "//input[@id='btnaccept']";
    private String saleResult = "//h2[contains(text(),'Sale Result')]";

    public FinalPage(){
        super(driver);
    }

    public void clickConfirmSale(){
        clickElement(confirmSaleButton);
    }
    
    public String saleResultPage(){
        return textFromElement(saleResult);
    }
}
