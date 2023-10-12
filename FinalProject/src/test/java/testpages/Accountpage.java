package testpages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.WebTestBase;
import util.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage  extends WebTestBase{
	
	@FindBy(xpath = "//h3[text()='DevOps Engineer Masters Program']")
	WebElement ScrollDown;
	
	@FindBy(xpath="//div[@class='dropdown dropdown_category_list']")
	WebElement categories;
	
	@FindBy(xpath="/html/body/nav/div[1]/ul/li[2]/a")
	WebElement devops;
	
	@FindBy(id="categoryfilterdropdown")
	WebElement filter_Btn;
	
	public void getCookiesHandle(){
        Utility.getCookies();
    
    }
	public void scrollDownMethod() {
        Utility.scrollDownByElement(driver, ScrollDown);
        // ScrollDown.click();
}
	
	public void mouse_Hover() throws InterruptedException
	{
		Utility.perform_Hovering(driver,devops,categories);
		/*Select select=new Select(filter_Btn);
		select.selectByVisibleText("Full Stack Web Developer");*/
	}
	
	public Accountpage(){
        PageFactory.initElements(driver, this);
    }
	

}
