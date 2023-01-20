package pages;

public class CampaignPage extends BasePage {

    private String enableAutoSearchCheckBox = "//input[@id='autosearch']";
    private String campaignField = "//input[@id='txtSearch']";
    private String saleButton = "//input[@id='btnSale']";
    private String  salePage = "//body/div[@id='block']/div[@id='container']/div[2]/div[1]/div[1]/h2[1]";
    private String quoteButton = "//input[@id='btnQuote']";
    private String quoteSection = "//div[@id='contentQuoteValue']";


    public CampaignPage(){
        super(driver);
    }

    public void checkEnableAutoSearch(){
        clickElement(enableAutoSearchCheckBox);
    }
    
    public void enterCampaignCode(String campaignCode){
        write(campaignField, campaignCode);
    }

    public String campaignMenu(String campaignCode){
        String campaignTable = "//td[contains(text(),'"+campaignCode+"')]";
        return textFromElement(campaignTable);
       }

    public void clickCampaignInTable(String campaignCode){
        String campaignTable = "//td[contains(text(),'"+campaignCode+"')]";
        clickElement(campaignTable);
    }

    public boolean saleButtonEnabled(){
        return elementIsEnabled(saleButton);
    }

    public void clickSalesButton(){
        clickElement(saleButton);
    }

    public void clickQuoteButton(){
        clickElement(quoteButton);
    }

    public boolean showTheSalePage(){
        return elementIsDisplayed(salePage);
    }

    public boolean showTheQuoteValue(){
        return elementIsDisplayed(quoteSection);
    }
}
