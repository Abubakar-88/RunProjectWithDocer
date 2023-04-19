package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private WebDriver driver;

    @Before
public void setup() throws MalformedURLException, InterruptedException {
    ChromeOptions opt = new ChromeOptions();
		
	 driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
    

}
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); 
        }
    }
}

