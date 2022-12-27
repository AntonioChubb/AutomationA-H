package pages;

public class PaymentPage extends BasePage {

    //private String paymentFrequencyDropdown = "//select[@id='PaymentFrecuency']";
    private String creditCardDropdown = "//select[@id='Code']";
    private String creditCardMonthDropdown = "//select[@id='ExpirationMonth']";
    private String creditCardYearDropdown = "//select[@id='ExpirationYear']";
    private String creditCardNumberField = "//input[@id='data']";
    private String securityCodeField = "//input[@id='SecurityCode']";
    private String nextButton = "//input[@id='submitForm']";
    private String confirmationPage = "//h2[contains(text(),'Sale Confirmation')]";
   
    public PaymentPage(){
        super(driver);
    }

    /*public void selectPaymentFrequency(String frequency){
        selectFromDropdownByText(paymentFrequencyDropdown, frequency);
    }
    */

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
}
