package pages;

public class LoginChubbPage extends BasePage {

    private String usernameField = "//input[@id='signInName']";
    private String passwordField = "//input[@id='password']";
    private String login = "//button[@id='next']";
    private String firstresult = "";

    public LoginChubbPage (){
        super(driver);
    }

    public void navigateToChubb(){

        navigateTo("https://auth.sit.chubb.com/cbaadb2c08sit.onmicrosoft.com/oauth2/v2.0/authorize?p=b2c_1a_susichubblocalecu&client_id=d2f8ac6f-4962-48c0-82c4-d8e6b804d12c&redirect_uri=https%3A%2F%2Flausd-wowsrv12.aceins.com%2FSecure%2F&resource=https%3A%2F%2Flausd-wowsrv12.aceins.com%2Fsecure&response_type=id_token&scope=openid%20profile&response_mode=form_post&nonce=638019796136106286.OTczYzk2ODgtNjMyYy00ZDAxLTllOGQtMTQ5YzJlNWZmNGIxZGE2ZWQyMjUtNDFlYy00ZDM0LTkwMGYtYmU5MjM3MzFmNDM0&state=CfDJ8G7KJX_6SdBKkTxwX5gK7x1W0OrZyrYq_nH90KfPffi72DUUwM4pVDDAmcKmepW-4g_TCCOPjf7XHKHK4A1uXqF3aWcHvt_asfm1E4MwNxjsl2YSmOyAnk2oGa0U3NxirYVhpM9FrduvWInbN2FcdTf0M2t1QJ596nfRCvDP3zKKRHfguoyVOOj6Zwn2hgzCWYFAGXQ8XOns0BfiKU0rXK0GGHVx6yRyg210xRHZio7dJgHizeJQOfjYUWmitRhfTGkLmfvEwybhycj4yzQryc8ExbORiHyetay3WAglaLVz7s1DKWfwuQ9qaBvTlkqz167yvffwTuLjCR9sYI6SnGc&x-client-SKU=ID_NETSTANDARD2_0&x-client-ver=6.10.0.0");
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

    public String firstResult(){
        return textFromElement(firstresult);
    }
}
