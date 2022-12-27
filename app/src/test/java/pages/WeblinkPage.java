package pages;

public class WeblinkPage extends BasePage {

    //private String weblinkMenu = "//body/div[@id='block']/div[@id='container']/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/a[1]";
    //private String saleList = "//body/div[@id='block']/div[@id='container']/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]";
    //private String saleOption = "//body/div[@id='block']/div[@id='container']/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/ul[1]/li[3]/ul[1]/li[1]/a[1]";
    private String campaignMenuText = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/h2[1]";

    public WeblinkPage(){
        super(driver);
    }

   /*public void hoverWeblinkMenu(){
        hoverOverElement(weblinkMenu);
    }

   public void hoverSalesList(){
        hoverOverElement(saleList);
   }

   public void clickSaleOption(){
        clickElement(saleOption);
   }
*/

public void hoverWeblink(){
    hoverOverElementWeblink();
   }


   public String campaignMenu(){
    return textFromElement(campaignMenuText);
   }
    
    
}
