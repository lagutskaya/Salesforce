package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Input {

    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing {} in to {}", text, label);
        driver.findElement(By.xpath(String.format(
                        "//label[text()='%s']/ancestor::lightning-input//input", label)))
                .sendKeys(text);
    }
}
