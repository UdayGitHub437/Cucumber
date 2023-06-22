package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.FbLoginPage;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Steps {
	WebDriver driver;
	FbLoginPage flp;
	@Given("User launches Google Chrome")
	public void user_launches_google_chrome() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   flp=new FbLoginPage(driver);
	}

	@Given("User opens Fb app <{string}>")
	public void user_opens_fb_app(String string) {
		driver.get(string);
		driver.manage().window().maximize();
	    
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		flp.username().sendKeys(username);
		flp.password().sendKeys(password);
	   
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
       flp.loginButton().click();
	}

	@Then("User should be logged in <{string}>")
	public void user_should_be_logged_in(String expectedTitle) {
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,expectedTitle,"Login Failed");
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}
}
