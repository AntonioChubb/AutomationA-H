package pages;

public class CampaignPage extends BasePage {

    private String enableAutoSearchCheckBox = "//input[@id='autosearch']";
    private String campaignField = "//input[@id='txtSearch']";
    private String campaignTable = "//td[contains(text(),'AR01005303')]";
    private String campaignSeleted = "//td[contains(text(),'AR01005303')]";
    private String saleButton = "//input[@id='btnSale']";
    private String  salePage = "//body/div[@id='block']/div[@id='container']/div[2]/div[1]/div[1]/h2[1]";


    public CampaignPage(){
        super(driver);
    }

    public void checkEnableAutoSearch(){
        clickElement(enableAutoSearchCheckBox);
    }
    
    public void enterCampaignCode(String campaignCode){
        write(campaignField, campaignCode);
    }

    public String campaignMenu(){
        return textFromElement(campaignTable);
       }

    public void clickCampaignInTable(){
        clickElement(campaignSeleted);
    }

    public boolean saleButtonEnabled(){
        return elementIsEnabled(saleButton);
    }

    public void clickSalesButton(){
        clickElement(saleButton);
    }

    public boolean showTheSalePage(){
        return elementIsDisplayed(salePage);
    }
}
