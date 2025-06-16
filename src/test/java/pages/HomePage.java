package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class HomePage extends BasePage {
    private static final By USER_ICON = By.cssSelector(".uiImage");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage open() {
        driver.get(BASE_URL + "lightning/setup/SetupOneHome/home");
        return this;
    }

    @Override
    public HomePage isPageOpened() {
        log.info("Home Page is opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_ICON));
        return this;
    }
}
