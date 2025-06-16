package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AccountListPage extends BasePage {

    private static final By NEW_BUTTON = By.cssSelector("[title=New]");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountListPage open() {
        driver.get(BASE_URL + "lightning/o/Account/list?filterName=MyAccounts");
        return this;
    }

    @Override
    public AccountListPage isPageOpened() {
        log.info("Account List Page is opened");
        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        return this;
    }
}
