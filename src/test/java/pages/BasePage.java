package pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@Data
@AllArgsConstructor
@Log4j2
public abstract class BasePage {
    public static final String BASE_URL = "https://tms9-dev-ed.develop.lightning.force.com/";
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public abstract BasePage open();

    public abstract BasePage isPageOpened();
}
