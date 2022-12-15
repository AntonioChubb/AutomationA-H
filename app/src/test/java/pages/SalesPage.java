package pages;

public class SalesPage extends BasePage {

    private String buttonAddPolicyHolder = "//input[@id='btnAddPolicyHolder']";
    private String personalIDField = "//input[@id='txtPersonalId']";
    private String acceptButton = "//span[contains(text()/'Accept')]";
    private String holderName = "//a[contains(text()/'MARIA ALBA URRISTE')]";
    
    public SalesPage(){
        super(driver);
    }

    public void clickAddPolicyHolder(){
        clickElement(buttonAddPolicyHolder);
    }

    public void enterPersonalID(String personalID){
        writeEnter(personalIDField, personalID);
    }

    public void clickAcceptButton(){
        clickElement(acceptButton);
    }
    
    public String showHolderInTable(){
        return textFromElement(holderName);
       }
}
