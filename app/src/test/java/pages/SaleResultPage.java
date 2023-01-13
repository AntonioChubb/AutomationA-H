package pages;

public class SaleResultPage extends BasePage {

    private String printAndDownloadButton = "//input[@id='Print']";
    private String dowloadButton = "//span[contains(text(),'Download Proof of Acceptance')]";
    private String printButton = "//span[contains(text(),'Print Proof of Acceptance')]";
    private String imprimirButton = "";
    private String cancelButton = "//span[contains(text(),'Cancel')]";

    public SaleResultPage(){
        super(driver);
    }

    public void clickPrintAndDownloadProofOfAcceptanceButton(){
        clickElement(printAndDownloadButton);
    }
    
    public void clickDownloadProofOfAcceptanceButton(){
        clickElement(dowloadButton);
    }

    public void clickPrintProofOfAcceptanceButton(){
        clickElement(printButton);
    }

    public void clickImprimirButton(){
        clickElement(imprimirButton);
    }

    public void clickCancelButton(){
        clickElement(cancelButton);
    }
}
