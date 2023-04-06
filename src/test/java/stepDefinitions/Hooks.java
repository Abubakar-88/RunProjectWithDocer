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
		
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriverManager.chromedriver().driverVersion("111.0.5563.64").setup();
	     ChromeOptions options = new ChromeOptions();
		 options.setBinary("/usr/bin/google-chrome");     
		 options.addArguments("--remote-allow-any-origin");
	      options.addArguments("--start-maximized");
		options.addArguments("--profile-directory=Default");
		//options.addArguments('--disable-dev-shm-usage');
		//	option.addArguments("--no-sandbox");
		//option.addArguments("--headless");
	   // Initialize the ChromeDriver with options
	      WebDriver driver = new ChromeDriver(options);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		driver = new RemoteWebDriver(capabilities);
		
		
// 		WebDriverManager.chromedriver().driverVersion("104.0.5112.29").setup();
// ChromeOptions optionsBeta = new ChromeOptions();
// optionsBeta.setBinary("C:\\location\\to\\chrome.exe");      
// WebDriver driver = new ChromeDriver(optionsBeta);
		
		
		
// 		ChromeOptions option = new ChromeOptions();
// 		options.addArguments("--remote-allow-any-origin");
// 		WebDriverManager.chromedriver().setup();
// 		driver = new ChromeDriver(option);
// 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	//	 WebDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	//     ChromeOptions options = new ChromeOptions();
	//      options.addArguments("--start-maximized");
	   // Initialize the ChromeDriver with options
	  //    WebDriver driver = new ChromeDriver(options);
		 
		 
//			ChromeOptions option = new ChromeOptions();
//			option.addArguments("headless");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(option);
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
         //  System.setProperty("webdriver.chrome.driver", "/home/ec2-user/chromedriver");

            // Launch Chrome browser
        //   driver.get("https://it.microtechlimited.com/");

           
           
            
            
     
         
  
		
    // chrome_options = Options();
	
		
		
	}
	
//		public String extractScreenShot(WebDriverException e) {
//		  Throwable cause = e.getCause();
//		  if (cause instanceof ScreenshotException) {
//		    return ((ScreenshotException) cause).getBase64EncodedScreenshot();
//		  }
//               return null;
//	}	
	@After
	public void tearDown() {
		  if (driver != null) {
                  driver.quit(); 
                 }
	}

}
