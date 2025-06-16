package pages;


import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@EqualsAndHashCode(callSuper = true)
@Log4j2
public class AccountsPage extends BasePage {

    private static final By FOLLOW_BUTTON = By.cssSelector("[title='Follow']"),
            TITLE = By.xpath("//lightning-formatted-text[@slot='primaryField']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage open() {
        return this;
    }

    @Override
    public AccountsPage isPageOpened() {
        log.info("Account Page is opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(FOLLOW_BUTTON));
        return this;
    }

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }
}
