package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

    private static final By TITLE = By.xpath("//h2[text()='New Account']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
    }

    public boolean isOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return true;
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollContainer = driver.findElement(By.cssSelector(".actionBody"));
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop +200;", scrollContainer);
    }

    public void createAccount(String name, String phone, String fax, String rating,
                              String website, String account_site, String ticker_symbol,
                              String type, String ownership, String industry, String employees,
                              String annual_revenue, String sic_code,
                              String billing_street, String billing_city, String billing_state_province,
                              String billing_zip_postal_code, String billing_country, String shipping_street,
                              String shipping_city, String shipping_state_province, String shipping_zip_postal_code,
                              String shipping_country, String customer_priority, String sla,
                              String sla_serial_number, String number_of_location,
                              String upsell_opportunity, String active, String description) {
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Picklist(driver, "Rating").select(rating);
        new TextArea(driver, "Website").write(website);
        new TextArea(driver, "Account Site").write(account_site);
        new TextArea(driver, "Ticker Symbol").write(ticker_symbol);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new TextArea(driver, "Employees").write(employees);
        new TextArea(driver, "Annual Revenue").write(annual_revenue);
        new TextArea(driver, "SIC Code").write(sic_code);
        scrollPage();
        new Checkbox(driver, "VIP Client").click();
        new Checkbox(driver, "TeachMeSkills").click();
        new TextArea(driver, "Billing Street").write(billing_street);
        new TextArea(driver, "Billing City").write(billing_city);
        new TextArea(driver, "Billing State/Province").write(billing_state_province);
        new TextArea(driver, "Billing Zip/Postal Code").write(billing_zip_postal_code);
        new TextArea(driver, "Billing Country").write(billing_country);
        new TextArea(driver, "Shipping Street").write(shipping_street);
        new TextArea(driver, "Shipping City").write(shipping_city);
        scrollPage();
        new TextArea(driver, "Shipping State/Province").write(shipping_state_province);
        new TextArea(driver, "Shipping Zip/Postal Code").write(shipping_zip_postal_code);
        new TextArea(driver, "Shipping Country").write(shipping_country);
        new Picklist(driver, "Customer Priority").select(customer_priority);
        new Picklist(driver, "SLA").select(sla);
        new TextArea(driver, "SLA Serial Number").write(sla_serial_number);
        new TextArea(driver, "Number of Locations").write(number_of_location);
        new Picklist(driver, "Upsell Opportunity").select(upsell_opportunity);
        new Picklist(driver, "Active").select(active);
        new TextArea(driver, "Description").write(description);
    }

    public void clickSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }
}
