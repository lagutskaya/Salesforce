package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

import java.util.List;

@Log4j2
public class NewAccountModal extends BasePage {

    private static final By ICON_CLOSE = By.xpath("//button[@title='Close error dialog']"),
            SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']"),
            SCROLL_FORM = By.cssSelector(".actionBody");
    private static final String ACCOUNT_NAME = "Account Name",
            RATING = "Rating",
            PHONE = "Phone",
            FAX = "Fax",
            ACCOUNT_NUMBER = "Account Number",
            WEBSITE = "Website",
            ACCOUNT_SITE = "Account Site",
            TICKER_SYMBOL = "Ticker Symbol",
            TYPE = "Type",
            OWNERSHIP = "Ownership",
            INDUSTRY = "Industry",
            EMPLOYEES = "Employees",
            ANNUAL_REVENUE = "Annual Revenue",
            SIC_CODE = "SIC Code",
            VIP_CLIENT = "VIP Client",
            TEACHMESKILLS = "TeachMeSkills",
            BILLING_STREET = "Billing Street",
            BILLING_CITY = "Billing City",
            BILLING_STATE_PROVINCE = "Billing State/Province",
            BILLING_ZIP_POSTAL_CODE = "Billing Zip/Postal Code",
            BILLING_COUNTRY = "Billing Country",
            SHIPPING_STREET = "Shipping Street",
            SHIPPING_CITY = "Shipping City",
            SHIPPING_STATE_PROVINCE = "Shipping State/Province",
            SHIPPING_ZIP_POSTAL_CODE = "Shipping Zip/Postal Code",
            SHIPPING_COUNTRY = "Shipping Country",
            CUSTOMER_PRIORITY = "Customer Priority",
            SLA = "SLA",
            SLA_EXPIRATION_DATE = "SLA Expiration Date",
            SLA_SERIAL_NUMBER = "SLA Serial Number",
            NUMBER_OF_LOCATIONS = "Number of Locations",
            UPSELL_OPPORTUNITY = "Upsell Opportunity",
            ACTIVE = "Active",
            DESCRIPTION = "Description";

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void closeIcon() {
        log.info("Icon is closed");
        List<WebElement> popups = driver.findElements(ICON_CLOSE);
        if (!popups.isEmpty()) {
            WebElement close = popups.get(0).findElement(ICON_CLOSE);
            close.click();
        }
    }

    public void clickCheckbox(String label) {
        log.info("Checkbox {} is clicked", label);
        new Checkbox(driver, label).click();
    }

    public void fillInput(String label, String value) {
        log.info("Input field {} is filled", label);
        new Input(driver, label).write(value);
    }

    public void enterTextArea(String label, String value) {
        log.info("Text area field {} is entered", label);
        new TextArea(driver, label).write(value);
    }

    public void selectPicklist(String label, String value) {
        log.info("Picklist {} is selected", label);
        new Picklist(driver, label).select(value);
    }

    @Override
    public NewAccountModal open() {
        driver.get(BASE_URL + "lightning/o/Account/new");
        return this;
    }

    @Override
    public NewAccountModal isPageOpened() {
        log.info("New account modal is opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".actionBody")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='New Account']")));
        wait.until(ExpectedConditions.elementToBeClickable(SAVE_BUTTON));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON));

        return this;
    }

    public AccountsPage clickSaveButton() {
        log.info("Save button is clicked");
        driver.findElement(SAVE_BUTTON).click();
        return new AccountsPage(driver);
    }

    public void scrollPage() {
        log.info("Page is scrolled");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollContainer = driver.findElement(SCROLL_FORM);
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop +200;", scrollContainer);
    }

    public NewAccountModal createAccount(String name, String phone, String fax, String rating,
                                         String account_number, String website, String account_site, String ticker_symbol,
                                         String type, String ownership, String industry, String employees,
                                         String annual_revenue, String sic_code, String vip_client, String teachMeSkills,
                                         String billing_street, String billing_city, String billing_state_province,
                                         String billing_zip_postal_code, String billing_country, String shipping_street,
                                         String shipping_city, String shipping_state_province, String shipping_zip_postal_code,
                                         String shipping_country, String customer_priority, String sla,
                                         String sla_expiration_date, String sla_serial_number, String number_of_location,
                                         String upsell_opportunity, String active, String description) {
        log.info("Account {} is created", name);

        fillInput(ACCOUNT_NAME, name);
        selectPicklist(RATING, rating);
        fillInput(PHONE, phone);
        fillInput(FAX, fax);

        scrollPage();

        fillInput(ACCOUNT_NUMBER, account_number);
        fillInput(WEBSITE, website);
        fillInput(ACCOUNT_SITE, account_site);
        fillInput(TICKER_SYMBOL, ticker_symbol);

        scrollPage();

        selectPicklist(TYPE, type);
        selectPicklist(OWNERSHIP, ownership);
        selectPicklist(INDUSTRY, industry);
        fillInput(EMPLOYEES, employees);
        fillInput(ANNUAL_REVENUE, annual_revenue);
        fillInput(SIC_CODE, sic_code);

        scrollPage();

        clickCheckbox(VIP_CLIENT);
        clickCheckbox(TEACHMESKILLS);
        enterTextArea(BILLING_STREET, billing_street);
        enterTextArea(SHIPPING_STREET, billing_street);

        scrollPage();

        fillInput(BILLING_CITY, billing_city);
        fillInput(BILLING_STATE_PROVINCE, billing_state_province);
        fillInput(SHIPPING_CITY, shipping_city);
        fillInput(SHIPPING_STATE_PROVINCE, shipping_state_province);

        scrollPage();

        fillInput(BILLING_ZIP_POSTAL_CODE, billing_zip_postal_code);
        fillInput(BILLING_COUNTRY, shipping_country);
        fillInput(SHIPPING_ZIP_POSTAL_CODE, shipping_zip_postal_code);
        fillInput(SHIPPING_COUNTRY, shipping_country);

        closeIcon();
        closeIcon();

        selectPicklist(CUSTOMER_PRIORITY, customer_priority);
        selectPicklist(SLA, sla);
        fillInput(SLA_EXPIRATION_DATE, sla_expiration_date);
        fillInput(SLA_SERIAL_NUMBER, sla_serial_number);
        fillInput(NUMBER_OF_LOCATIONS, number_of_location);
        scrollPage();
        selectPicklist(UPSELL_OPPORTUNITY, upsell_opportunity);
        selectPicklist(ACTIVE, active);
        enterTextArea(DESCRIPTION, description);

        return this;
    }
}
