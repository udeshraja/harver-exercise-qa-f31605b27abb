package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dropdown extends testBase {
    protected WebElement waitElement;
    Select select;

    private final By dropdown = By.id("dropdown");

    public dropdown(WebDriver driver) {
       driver = driver;
    }

    public void GetValuesFromDropDown() {
        WebDriverWait wait = new WebDriverWait(testBase.driver, Duration.ofSeconds(10));
        waitElement = wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        select = new Select(driver.findElement(dropdown));
    }

    public void ClickDropDown() {
        WebDriverWait wait = new WebDriverWait(testBase.driver, Duration.ofSeconds(10));
        waitElement = wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        select.selectByValue("1");
    }


}
