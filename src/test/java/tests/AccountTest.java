package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {

    public AccountTest(WebDriver driver, WebDriverWait wait, SoftAssert softAssert, NewAccountModal newAccountModal,
                       AccountListPage accountListPage, HomePage homePage, LoginPage loginPage,
                       AccountsPage accountsPage,
                       String user, String password) {
        super(driver, wait, softAssert, newAccountModal, accountListPage, homePage, loginPage, accountsPage,user, password);
    }

    @Test
    public void checkCreateAccountFull() {
        loginPage.open()
                .isPageOpened()
                .login(user, password);
        homePage.isPageOpened();
        newAccountModal.open()
                .isPageOpened();
        newAccountModal.createAccount("User", "+375291233322", "+375291233322", "Hot",
                "1234", "www.website.com", "www.TMS.com", "ticker_symbol",
                "type", "Private", "Banking", "111", "1223",
                "220141", "VIP Client", "TeachMeSkills", "street",
                "city", "province", "220141", "country",
                "street", "city", "province",
                "220141", "country", "Low", "Gold",
                "01.01.2041", "SLA", "1", "No",
                "Yes", "Description");
        newAccountModal.clickSaveButton();
        assertEquals(accountsPage.getTitle(),
                "User",
                "Аккаунт не создан");
    }
}
