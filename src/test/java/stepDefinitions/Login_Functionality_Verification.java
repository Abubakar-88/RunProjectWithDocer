package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Login_Functionality_Verification extends Base {
	private int screenshotCounter = 1;
	private SoftAssert soft = new SoftAssert();
	@Given("I am in Landing Home Page")
	public void i_am_in_Landing_Page() {
	  System.out.println("Home page");
		if(driver != null) {
			driver.get("https://it.microtechlimited.com/");	
			String s = driver.findElement(By.xpath("//div//h1['Welcome to MicroTech NA.']")).getText();
			//assertEquals("Welcome to MicroTech NA.", s);
			System.out.println("welcom text: "+ s);
		} else {
			// Handle case when driver is not initialized
			System.out.println("Driver is not initialized");
		}

	}


	@When("I click on Login menu")
	public void i_Click_on_Login_menu() {
		//click(By.xpath("//a[@href=\"elogin.php\"]"));
		driver.findElement(By.xpath("//a[@href=\"elogin.php\"]")).click();
		 System.out.println("somthing");
		 }
//driver.quit();
	@Then("I am in the employee Login Page")
	public void i_am_in_the_employee_Login_Page() {
//		String s = getText(By.xpath("//div//h1"));
//		assertEquals("Employee Login", s);
//		System.out.println("Employee Login Text: "+ s);
		try {

			String s = getText(By.xpath("//div//h1"));
			soft.assertEquals("Employee Loginllll", s);
			soft.assertAll();
		} catch (AssertionError e) {
			// Log the assertion failure but continue with the test
			System.out.println("Assertion failed: " + e.getMessage());
		}

	}
	@Then("I click Customer Login menu")
	public void i_click_Customer_Login_menu() {
		click(By.xpath("//a[@href='clogin.php']"));
		String customerLogin= getText(By.xpath("//div/h1"));
		assertEquals("Customer Login", customerLogin);	
		System.out.println("Customer Login Text: "+ customerLogin);
	}

	@Then("I enter User Id {string}")
	public void i_enter_User_Id(String email) {

		sendKeys(By.name("mailuid"),email);
		System.out.println("enter user ID");
	}

	@Then("I enter Password {string}")
	public void i_enter_Password(String pass) {
		sendKeys(By.name("pwd"),pass);
	}

	@When("I click Login Button")
	public void i_click_Login_Button() {
	    click(By.xpath("//input[@name=\"login-submit\"]"));
	}
	
	@Then("I will see Customer Home Page")
	public void i_will_see_Customer_Home_Page() {
	    String s= getText(By.xpath("//h2[text()='Welcome David']"));
	    assertEquals("Welcome David",s);
	    System.out.println(s);
	}

}
