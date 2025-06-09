package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private static final By TITLE = By.xpath(
            "//span[text()='Home']//ancestor::div[@class='overflow uiBlock']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return true;
    }
}
