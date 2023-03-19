package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JENKIN
		DesiredCapabilities capabilities = new DesiredCapabilities();
		driver = new RemoteWebDriver(capabilities);
		Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
	}
	
		public String extractScreenShot(WebDriverException e) {
		  Throwable cause = e.getCause();
		  if (cause instanceof ScreenshotException) {
		    return ((ScreenshotException) cause).getBase64EncodedScreenshot();
		  }
               return null;
	}	
	@After
	public void tearDown() {
		driver.close();
	}

}
