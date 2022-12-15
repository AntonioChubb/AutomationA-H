package pages;

public class LoginChubbPage extends BasePage {

    private String usernameField = "//input[@id='signInName']";
    private String passwordField = "//input[@id='password']";
    private String login = "//button[@id='next']";
    private String result = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]";

    public LoginChubbPage (){
        super(driver);
    }

    public void navigateToChubb(){
        navigateTo("https://lausd-wowsrv12.aceins.com/WelcomeSite");
        }
    
    public void clickChubbLogin(){
        clickElement(login);
    }

    public void enterUsername(String username){
        write(usernameField, username);
       
    }

    public void enterPassword(String password){
        write(passwordField, password);
    }

    public boolean firstResult(){
        return elementIsDisplayed(result);
    }
}
