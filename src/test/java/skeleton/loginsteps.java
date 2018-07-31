package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginsteps {
	WebDriver d;
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://newtours.demoaut.com/");
		throw new PendingException();
	}

	@When("^user provides the correct credentials$")
	public void user_provides_the_correct_credentials() throws Throwable {
		d.findElement(By.name("userName")).sendKeys("invalidUN");
		d.findElement(By.name("password")).sendKeys("invalidPW");
		d.findElement(By.name("login")).click();
		throw new PendingException();
	}

	@Then("^user rendered to TestMeApp home page$")
	public void user_rendered_to_TestMeApp_home_page() throws Throwable {
		Assert.assertEquals("Find a Flight: Mercury Tours:", d.getTitle());
		throw new PendingException();
	}


}
