package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    static WebDriver driver;
    public static final String BASE_URL = "https://tms9-dev-ed.develop.my.salesforce.com/";
    public WebDriverWait wait;
    public Actions actions;

    public BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }
}
