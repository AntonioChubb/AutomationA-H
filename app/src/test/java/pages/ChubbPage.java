package pages;

public class ChubbPage extends BasePage{

    private String weblinklink = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]";
    private String weblinkpage = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]";


    public ChubbPage(){
        super(driver);
    }

    public void clickWeblinkLink(){
        clickElement(weblinklink);
    }

    public boolean showBienvenida(){
        return elementIsDisplayed(weblinkpage);
    }
    
}
