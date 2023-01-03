package pages;

public class SalesPage extends BasePage {

    private String personalIDField = "//input[@id='txtPersonalId']";
    private String acceptButton = "//body/div[4]/div[3]/div[1]/button[2]";
    private String benefitLevelDropdown = "//select[@id='ddlBenefitLevel']";
    private String aceptProductButton = "//button[@id='btnAcceptPP']";
    private String nextButton = "//input[@id='nextButton']";
    private String paymentInfoPage = "//div[@id='PayData']";

    public SalesPage(){
        super(driver);
    }

    public void clickAddPolicyHolder(String button){
        String buttonAddPolicyHolder = "//input[@id='"+button+"']";
        clickElement(buttonAddPolicyHolder);
    }

    public void enterPersonalID(String personalID){
        writeEnter(personalIDField, personalID);
    }

    public void clickAcceptButton(){
        clickElement(acceptButton);
    }
    
    public String showHolderInTable(String name){
        String holderName = "//a[contains(text()/'"+name+"')]";
        return textFromElement(holderName);
       }

    public void clickAddProductIcon(Integer icon){
        String addProductImage = "//tbody[1]/tr[2]/td["+icon+"]/a[1]/img[1]";
        clickElement(addProductImage);
    }

    public void selectBenefitLevel(String level){
        selectFromDropdownByText(benefitLevelDropdown, level);
    }

    public void clickProductAcceptButton(){
        clickElement(aceptProductButton);
    }

    public boolean iconDisplayed(Integer newIconShow){
        String newIcon = "//tbody/tr[2]/td["+newIconShow+"]/a[2]/img[1]";
        return elementIsDisplayed(newIcon);
    }

    public void clickNextButton(){
        clickElement(nextButton);
    }

    public boolean paymentInfoPage(){
        return elementIsDisplayed(paymentInfoPage);
       }
}
