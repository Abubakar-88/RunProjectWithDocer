package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions()
            .setBinary("/usr/bin/google-chrome")
            .addArguments("--remote-allow-any-origin", "--start-maximized", "--headless", "--disable-gpu", "--disable-dev-shm-usage", "--no-sandbox");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        try {
            if (driver != null) {
                driver.quit(); 
            }
        } catch (WebDriverException e) {
            System.err.println("Exception during WebDriver teardown: " + e.getMessage());
        }
    }
}
