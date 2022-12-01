package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    protected static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        new WebDriverWait(driver,10);
    }

    public BasePage (WebDriver driver){
        BasePage.driver = driver;
        new WebDriverWait(driver,10);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}
