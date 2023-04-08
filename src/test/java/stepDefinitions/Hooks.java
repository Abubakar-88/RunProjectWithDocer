package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	     ChromeOptions options = new ChromeOptions();
		 options.setBinary("/usr/bin/google-chrome");     
		 options.addArguments("--remote-allow-any-origin");
	     options.addArguments("--start-maximized");
		 option.addArguments("--headless");
		 option.addArguments("--disable-gpu");
		 option.addArguments("--remote-debugging-port=9222");
	   // Initialize the ChromeDriver with options
	      WebDriver driver = new ChromeDriver(options);
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
