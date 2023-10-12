package testpages;

import org.openqa.selenium.WebElement;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;

public class Search extends WebTestBase{
	@FindBy(xpath="//input[@Class='open_search_overlay']")
	WebElement SearchButton;
	
	@FindBy (id="search-input")
	WebElement search;
	public Search()
	{
		PageFactory.initElements(driver, this);
	}

	public void searchbtn() throws AWTException {
		SearchButton.click();
		search.click();
		search.sendKeys("java certification training course");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
}
