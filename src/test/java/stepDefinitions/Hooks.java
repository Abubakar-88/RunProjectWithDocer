package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() {
		
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		options.setCapability("webdriver.remote.session.timeout", 300000);
		
		WebDriverManager.chromedriver().setup();
	//	PropertiesCollection.driver = new ChromeDriver(options)
		driver=new ChromeDriver(options);
		
		
		
	
		
		
		
		
		
		
		
	}
	@After
	public void tearDown() {
		driver.close();
	}

}
