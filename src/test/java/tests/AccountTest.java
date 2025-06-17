package tests;


import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {

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
                "Prospect", "Private", "Banking", "111", "1223",
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
