package pages;

public class SalesPage extends BasePage {

    private String personalIDField = "//input[@id='txtPersonalId']";
    private String acceptButton = "//span[contains(text(),'Accept')]";
    private String benefitLevelDropdown = "//select[@id='ddlBenefitLevel']";
    private String aceptProductButton = "//button[@id='btnAcceptPP']";
    private String nextButton = "//input[@id='nextButton']";
    private String paymentInfoPage = "//div[@id='PayData']";
    private String brandField = "//input[@data-name='Brand']";
    private String modelField = "//input[@data-name='Model']";
    private String tagField = "//input[@data-name='Tag']";
    private String VINField = "//input[@data-name='VIN']";
    private String yearField = "//input[@data-name='Year']";
    private String benficiaryButton = "//input[@id='btnAdd']";
    private String beneficiaryNameField = "//input[@id='name']";
    private String BeneficiaryPercentageField = "//input[@id='percentage']";
    private String relationshipDropdown = "//select[@id='relationship']";
    private String saveBeneficiaryButton = "//input[@id='submitBtn']";
    private String closeButton = "//span[contains(text(),'Close')]";
    private String newHolderNameField  = "//input[@id='txtFirstName']";
    private String newHolderLastnameField = "//input[@id='txtLastName']";
    private String newHolderBirthdateField = "//input[@id='txtBirthDate']";
    private String newHolderMailField = "//input[@id='txtEmail']";
    private String newHolderSexDropdown = "//select[@id='ddlSex']";
    private String homeCheckbox = "//input[@id='HomeAddressChk']";
    private String newHolderAddress1Field =  "//input[@id='txtAddress1219']";
    private String newHolderProvinceDropdown =  "//select[@id='ddlProvince219']";
    private String newHolderCityField = "//input[@id='txtCity219']";
    private String quoteButton = "//input[@id='Quote']";
  

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
        String holderName = "//a[contains(text(),'"+name+"')]";
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

    public void clickQuoteButton(){
        clickElement(quoteButton);
    }

    public boolean paymentInfoPage(){
        return elementIsDisplayed(paymentInfoPage);
       }

       public void enterBrand(String brand){
        write(brandField, brand);
    }

    public void enterModel(String model){
        write(modelField, model);
    }

    public void enterTag(String tag){
        write(tagField, tag);
    }

    public void enterVIN(String VIN){
        write(VINField, VIN);
    }

    public void enterYear(String year){
        write(yearField, year);
    }

    public void clickAddBeneficiaryIcon(String icon){
        String newIcon = "//tbody/tr[2]/td["+icon+"]/a[2]/img[1]";
        clickElement(newIcon);
    }

    public void clickAddBeneficiaryButton(){
        clickElement(benficiaryButton);
    }

    public void enterBeneficiaryName(String name){
        write(beneficiaryNameField, name);
    }

    public void enterBeneficiaryPercentage(String percentage){
        write(BeneficiaryPercentageField, percentage);
    }

    public void selectRelationship(String relationship){
        selectFromDropdownByText(relationshipDropdown, relationship);
    }

    public void clickSaveBeneficiaryButton(){
        clickElement(saveBeneficiaryButton);
    }

    public String showBeneficiaryInTable(String beneficiary){
        String newBeneficiary = "//a[contains(text(),'"+beneficiary+"')]";
        return textFromElement(newBeneficiary);
    }

    public void clickCloseButton(){
        clickElement(closeButton);
    }

    public void enterNewPersonalID(String newPersonalID){
        writeTab(personalIDField, newPersonalID);
    }

    public void enterNewHolderName(String newHolderName){
        write(newHolderNameField, newHolderName);
    }

    public void enterNewHolderLastname(String newHolderLastname){
        write(newHolderLastnameField, newHolderLastname);
    }

    public void enterNewHolderBirthdate(String newHolderBirthdate){
        write(newHolderBirthdateField, newHolderBirthdate);
    }

    public void enterNewHolderMail(String newHolderMail){
        write(newHolderMailField, newHolderMail);
    }

    public void selectNewHolderSex(String newHolderSex){
        selectFromDropdownByText(newHolderSexDropdown, newHolderSex);
    }

    public void MarkHomeCheckbox(){
        clickElement(homeCheckbox);
    }

    public void enterNewHolderAddress1(String newHolderAddress1){
        write(newHolderAddress1Field, newHolderAddress1);
    }

    public void selectNewHolderProvince(String newHolderProvince){
        selectFromDropdownByText(newHolderProvinceDropdown, newHolderProvince);
    }

    public void enterNewHolderCity(String newHolderCity){
        write(newHolderCityField, newHolderCity);
    }

    public String showNewHolderInTable(String name){
        String newHolderName = "//a[contains(text(),'"+name+"')]";
        return textFromElement(newHolderName);
       }
}
