package pages;

public class CampaignPage extends BasePage {

    private String enableAutoSearchCheckBox = "//input[@id='autosearch']";
    private String campaignField = "//input[@id='txtSearch']";
    private String campaignTable = "//td[contains(text(),'AR01005303')]";

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

}
