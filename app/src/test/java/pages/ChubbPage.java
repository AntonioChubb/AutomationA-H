package pages;

public class ChubbPage extends BasePage{

    private String weblinklink = "";
    private String weblinkpage = "";

    public ChubbPage(){
        super(driver);
    }

    public void clickWeblinkLink(){
        clickElement(weblinklink);
    }

    public String weblinkResult(){
        return textFromElement(weblinkpage);
    }
    
}
