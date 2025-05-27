package tests;

import org.testng.annotations.Test;


public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() {

        loginPage.login();
        homePage.isOpened();
        accountsPage.open();
        accountsPage.isOpened();
        newAccountModal.open();
        newAccountModal.isOpened();
        newAccountModal.createAccount(
                "Polina", "+375295432311", "+375295432311", "Hot",
                "www.TMS.com", "www.TMS/account.com", "TMS",
                "Prospect", "Public", "Agriculture", "1000", "TMS-123/123",
                "220141", "Pervomayskaya", "Minsk", "State",
                "220141", "Belarus", "32000", "Minsk",
                "State", "220141", "Belarus",
                "High", "Gold", "220141", "220141",
                "Maybe", "Yes", "TMS test");
        newAccountModal.clickSaveButton();
    }
}
