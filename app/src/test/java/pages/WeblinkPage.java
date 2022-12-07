package pages;

public class WeblinkPage extends BasePage {

    private String weblinkMenu = "";
    private String saleList = "";
    private String saleOption = "";
    private String campaignMenuText = "";

    public WeblinkPage(){
        super(driver);
    }

    public void hoverWeblinkMenu(){
        hoverOverElement(weblinkMenu);
    }

   public void hoverSalesList(){
        hoverOverElement(saleList);
   }

   public void clickSaleOption(){
        clickElement(saleOption);
   }

   public String campaignMenu(){
    return textFromElement(campaignMenuText);
   }
    
}
