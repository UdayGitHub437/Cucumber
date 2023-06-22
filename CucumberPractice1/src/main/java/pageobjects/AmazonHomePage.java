package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	WebDriver driver;
	public AmazonHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By hoverOnSignInButton=By.id("nav-link-accountList-nav-line-1");
	By clickSignInButton=By.xpath("(//span[text()='Sign in'])[1]");
	
	public WebElement hoverOnSignInButton()
	{
		return driver.findElement(hoverOnSignInButton);
	}
	public WebElement clickSignInButton()
	{
		return driver.findElement(clickSignInButton);
	}
}
