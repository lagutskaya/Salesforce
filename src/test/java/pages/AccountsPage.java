package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage {

    public static final String ACCOUNTS_PAGE =
            "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=__Recent";
    private static final By TITLE = By.xpath(
            "//lightning-formatted-text[@slot='primaryField']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage open() {
        driver.get(ACCOUNTS_PAGE);
        return this;
    }

    public AccountsPage isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }
}
