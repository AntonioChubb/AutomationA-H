package steps;

import java.io.File;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SaleResultPage;

public class DowloadAndPrintProofStep {

    private String downloadFilePath = "src/test/resources/downloadProof";

    @BeforeClass
    public void BeforeClass(){
        HashMap<String, Object> chromePref = new HashMap<String, Object>();
        chromePref.put("dowload.default_directory", downloadFilePath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePref);

        new ChromeDriver(options);
    }

    SaleResultPage saleResultPage = new SaleResultPage();

    @Given ("the user click on button Print Proof of Acceptance")
    public void clickOnPrintAndDownloadProofButton(){
        saleResultPage.clickPrintAndDownloadProofOfAcceptanceButton();
    }

    @When ("click on Dowload Proof of Acceptance Button")
    public void clickOnDowloadProofButton(){
        saleResultPage.clickDownloadProofOfAcceptanceButton();
    }

    @And ("the PDF file is dowloaded")
    public void verifyDownload(){
        File folder = new File(downloadFilePath);
        File[] listofFiles = folder.listFiles();
        Assert.assertTrue("File not downloaded correctly", listofFiles.length>0);
        try{
            Thread.sleep(3000);
        }catch(Exception e){}
    }

    @And ("click on Print Proof of Acceptance Button")
    public void clickOnPrintProofButton(){
        saleResultPage.clickPrintProofOfAcceptanceButton();
    }

    @And ("click on Imprimir Button")
    public void clickOnImprimirButton(){
        saleResultPage.clickImprimirButton();
    }

    @Then ("The user click on Cancel button of Preview of CAS")
    public void clickOnCancelButton(){
        saleResultPage.clickCancelButton();
    }
    
}
