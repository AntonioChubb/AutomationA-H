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
}

