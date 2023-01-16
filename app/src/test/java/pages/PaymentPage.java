package pages;

public class PaymentPage extends BasePage {

    private String paymentFrequencySection = "//h3[@id='ui-accordion-1-header-0']";
    private String paymentFrequencyDropdown = "//select[@id='PaymentFrecuency']";
    private String creditCardDropdown = "//select[@id='Code']";
    private String creditCardMonthDropdown = "//select[@id='ExpirationMonth']";
    private String creditCardYearDropdown = "//select[@id='ExpirationYear']";
    private String creditCardNumberField = "//input[@id='data']";
    private String securityCodeField = "//input[@id='SecurityCode']";
    private String nextButton = "//input[@id='submitForm']";
    private String confirmationPage = "//h2[contains(text(),'Sale Confirmation')]";
    private String directDebitOption = "//tbody[1]/tr[1]/td[4]/input[1]";
    private String bankDropdown = "//select[@id='DirectDebitBank']";
    private String accountField = "//input[@id='data']";
    private String dayDropdown = "//select[@id='DirectDebitDebitDay']";
    private String collectorDropdown = "//select[@id='BorderauxCollector']";
    private String expirationDateField = "//input[@id='PolicyExpirationDate']";
    private String giroCollectorDropdown = "//select[@id='GiroCollector']";
    private String giroBankDropdown = "//select[@id='GiroBank']";
    private String branchField = "//input[@id='GiroBranch']";
    private String giroAccountNumber = "//input[@id='data']";
    private String differentPayerCheckbox = "//input[@id='PolicyPayerDiferentPolicyHolder']";
    private String payerIDField = "//input[@id='PersonalId']";
    private String payerNameField = "//input[@id='FirstName']";
    private String payerLastnameField = "//input[@id='Lastname']";
    private String payerBirthdatField = "//input[@id='Birthdate']";
    private String payerSexSelect = "//select[@id='Sex']";
    private String payerAdress1Field = "//input[@id='Address1']";
    private String payerProvinceSelect = "//select[@id='ProvinceId']";
    private String payerCityField = "//input[@id='City']";
    
    public PaymentPage(){
        super(driver);
    }

     public boolean showPaymentFrequencySection(){
        return elementIsDisplayed(paymentFrequencySection);
    }

    public void selectPaymentFrequency(String frequency){
        selectFromDropdownByText(paymentFrequencyDropdown, frequency);
    }
    
    public void selectCreditCardType(String creditCardType){
        selectFromDropdownByText(creditCardDropdown, creditCardType);
    }

    public void selectCreditCardMonth(String month){
        selectFromDropdownByText(creditCardMonthDropdown, month);
    }

    public void selectCreditCardYear(String year){
        selectFromDropdownByText(creditCardYearDropdown, year);
    }

    public void switchToIFrame(int iframeIndex){
        switchToiFrame(iframeIndex);
    }

    public void enterCardNumber(String creditCardNumber){
        write(creditCardNumberField, creditCardNumber); 
    }

    public void exitIFrame(){
        switchToParentFrame();
    }

    public void enterSecurityCode(String securityCodeNumber){
        write(securityCodeField, securityCodeNumber); 
    }

    public void clickNextButton(){
        clickElement(nextButton);
    }

    public String paymentInfoPage(){
        return textFromElement(confirmationPage);
    }

    public void selectDirectDebitOption(){
        clickElement(directDebitOption);
    }

    public void selectBank(String bank){
        selectFromDropdownByText(bankDropdown, bank);
    }

    public void enterAccountNumber(String account){
        write(accountField, account); 
    }

    public void selectDebitDay(String debitDay){
        selectFromDropdownByValue(dayDropdown, debitDay);
    }

    public void selectCollector(String collector){
        selectFromDropdownByText(collectorDropdown, collector);
    }

    public void writeExpirationDate(String expirationDate){
        write(expirationDateField, expirationDate);
    }

    public void selectGiroCollector(String giroCollector){
        selectFromDropdownByText(giroCollectorDropdown, giroCollector);
    }

    public void selectGiroBank(String giroBank){
        selectFromDropdownByText(giroBankDropdown, giroBank);
    }

    public void typeGiroBranch(String branch){
        writePlusKeys(branchField, branch);
    }

    public void typeGiroAccountNumber(String account){
        write(giroAccountNumber, account);
    }

    public void checkDifferentPayer(){
        clickElement(differentPayerCheckbox);
    }

    public  void typePayerID(String payerID){
        write(payerIDField, payerID);
    }

    public  void typePayerName(String payerName){
        write(payerNameField, payerName);
    }

    public  void typePayerLastname(String payerLastname){
        write(payerLastnameField, payerLastname);
    }

    public  void typePayerBirthdate(String payerBirthdate){
        write(payerBirthdatField, payerBirthdate);
    }

    public void selectPayerSex(String payerSex){
        selectFromDropdownByText(payerSexSelect, payerSex);
    }

    public  void typePayerAddress1(String payerAddress1){
        write(payerAdress1Field, payerAddress1);
    }

    public void selectPayerProvince(String payerProvince){
        selectFromDropdownByText(payerProvinceSelect, payerProvince);
    }

    public  void typePayerCity(String payerCity){
        write(payerCityField, payerCity);
    }
}

