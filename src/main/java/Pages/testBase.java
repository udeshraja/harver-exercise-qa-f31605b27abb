package Pages;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

public class testBase {

    public static WebDriver driver;
    public static String baseURL = "https://the-internet.herokuapp.com/";
    @BeforeClass
    public void browser() {
        String browserName = "chrome";
        switch (browserName) {
            case "chrome" -> {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--window-size=1400,600");
                driver = new ChromeDriver(options);
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }
            case "firefox" -> {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--headless");
                options.addArguments("--window-size=1400,600");
                driver = new FirefoxDriver(options);
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }

        }
    }
    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
