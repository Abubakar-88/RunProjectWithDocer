package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() {
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("--headless");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--allow-insecure-localhost");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-browser-side-navigation");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--force-device-scale-factor=1");
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver(options);
		
		
	}
	@After
	public void tearDown() {
		driver.close();
	}

}
