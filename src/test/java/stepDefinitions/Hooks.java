package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
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
		 WebDriver driver = new ChromeDriver();
		try {
			ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		//option.addArguments("--headless");
		//option.addArguments("--no-sandbox");
	// driver.get("https://www.example.com");	
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JENKIN
		//DesiredCapabilities capabilities = new DesiredCapabilities();
	//	driver = new RemoteWebDriver(capabilities);
	//	Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		//driver.get("https://www.google.com/");
			// 
		
            // Set the path to the chromedriver executable
           System.setProperty("webdriver.chrome.driver", "/home/ec2-user/chromedriver");

            // Launch Chrome browser
           driver.get("https://it.microtechlimited.com/");

            // Navigate to a URL
           // driver.get("");

            // Close the browser
           // driver.quit();
        } catch (WebDriverException e) {
            // Handle the exception
//           System.out.println("Chrome browser failed to start: " + e.getMessage());
//            e.printStackTrace();
           if (e.getMessage().contains("chrome location /usr/bin/google-chrome")) {
               System.out.println("ChromeDriver is assuming that Chrome has crashed.");
                // Restart ChromeDriver and try again
            //    driver.quit();
               driver = new ChromeDriver();
                driver.get("https://www.example.com");
            } else {
                // Handle other types of exceptions
                System.out.println("WebDriverException occurred: " + e.getMessage());
            
            
            
          }
         
      }
		
    // chrome_options = Options();
	
		
		
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
		 driver.quit();
	}

}
