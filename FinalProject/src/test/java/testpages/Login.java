package testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;

public class Login extends WebTestBase {
	
	@FindBy(xpath="//li[@class='hidden-xs']/span[text()='Log In']")
	
	WebElement loginbutton;
	@FindBy(id="si_popup_email")
	WebElement username;
	@FindBy(id="si_popup_passwd")
	WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	public Login()
	{
		PageFactory.initElements(driver, this);
	}

	public void login_click()
	{
		loginbutton.click();
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
	}
}
