package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class VerifyTitle {
	WebDriver driver;
	@Given("Browser is launched")
	public void browser_is_launched() {
	 WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@When("I open home page")
	public void i_open_home_page() {
	    driver.get("http://demo.guru99.com/test/newtours/login.php");
	    driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	@Then("I verify the title of home page")
	public void i_verify_the_title_of_home_page() {
	    Assert.assertEquals(driver.getTitle(),"Sign-on: Mercury Tours");
	}

	@Then("close the browser")
	public void close_the_browser() {
	  driver.close();
	}
}
