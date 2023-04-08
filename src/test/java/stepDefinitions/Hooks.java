package stepDefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	private WebDriver driver;
	
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-setuid-sandbox"); 
		options.addArguments("--remote-debugging-port=9222");
		options.addArguments("--disable-dev-shm-using"); 
		options.addArguments("--disable-extensions"); 
		options.addArguments("--disable-gpu");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit(); 
		}
	}
}
