package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollContainer = driver.findElement(By.cssSelector(".actionBody"));
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop +200;", scrollContainer);
    }
}
