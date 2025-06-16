package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Checkbox {

    WebDriver driver;
    String label;

    public Checkbox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void click() {
        log.info("Click on {} checkbox", label );
        driver.findElement(By.xpath(String.format(
                        "//span[text() = '%s']/ancestor::lightning-input//input[@type='checkbox']", label)))
                .click();
    }
}
