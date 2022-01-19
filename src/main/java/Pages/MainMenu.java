package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainMenu extends testBase {

    protected WebElement waitElement;

    private final By dropdown = By.xpath("//*[@id=\"content\"]/ul/li[11]/a");

    public MainMenu(WebDriver driver) {
        driver = driver;
    }

    public void NavigateToDropDownPage() {
        WebDriverWait wait = new WebDriverWait(testBase.driver, Duration.ofSeconds(10));
        waitElement = wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        testBase.driver.findElement(dropdown).click();
    }


}
