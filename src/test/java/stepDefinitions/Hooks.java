package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        // options.setBinary("/usr/bin/google-chrome");     
        options.addArguments("--remote-allow-any-origin");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");
		options.addArguments("--remote-debugging-address=0.0.0.0");

        // Initialize the ChromeDriver with options
        driver = new ChromeDriver(options);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        driver = new RemoteWebDriver(capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); 
        }
    }
}
