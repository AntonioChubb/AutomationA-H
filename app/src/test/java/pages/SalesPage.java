package pages;

public class SalesPage extends BasePage {

    private String buttonAddPolicyHolder = "//input[@id='btnAddPolicyHolder']";
    private String personalIDField = "//input[@id='txtPersonalId']";
    private String acceptButton = "//body/div[4]/div[3]/div[1]/button[2]";
    private String holderName = "//tbody[1]/tr[2]/td[2]/a[contains(text()/'MARIA ALBA URRISTE')]";
    private String addProductImage = "//tbody[1]/tr[2]/td[4]/a[1]/img[1]";
    private String benefitLevelDropdown = "//select[@id='ddlBenefitLevel']";
    private String aceptProductButton = "//button[@id='btnAcceptPP']";
    private String newIcon = "//tbody/tr[2]/td[4]/a[1]/img[1]";
    private String nextButton = "//input[@id='nextButton']";
    private String paymentInfoPage = "//div[@id='PayData']";

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

    public void clickAddProductIcon(){
        clickElement(addProductImage);
    }

    public void selectBenefitLevel(String level){
        selectFromDropdownByText(benefitLevelDropdown, level);
    }

    public void clickProductAcceptButton(){
        clickElement(aceptProductButton);
    }

    public boolean iconDisplayed(){
        return elementIsDisplayed(newIcon);
    }

    public void clickNextButton(){
        clickElement(nextButton);
    }

    public boolean paymentInfoPage(){
        return elementIsDisplayed(paymentInfoPage);
       }
}
