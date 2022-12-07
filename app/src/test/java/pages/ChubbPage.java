package pages;

public class WeblinkPage extends BasePage{

    private String weblinklink = "";
    private String weblinkpage = "";

    public WeblinkPage(){
        super(driver);
    }

    public void clickWeblinkLink(){
        clickElement(weblinklink);
    }

    public String weblinkResult(){
        return textFromElement(weblinkpage);
    }
    
}
