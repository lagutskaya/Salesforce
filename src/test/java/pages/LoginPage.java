package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login() {
        driver.get(BASE_URL);
        driver.findElement(USERNAME).sendKeys("tborodich@tms.sandbox");
        driver.findElement(PASSWORD).sendKeys("Password002!");
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }
}
