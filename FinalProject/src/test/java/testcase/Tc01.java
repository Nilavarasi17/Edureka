package testcase;
import org.testng.asserts.SoftAssert;
import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.WebTestBase;
import testpages.Accountpage;
import testpages.Login;
import testpages.Search;

public class Tc01 extends WebTestBase{
	Login login;
	Search search;
	Accountpage AccountPage;
	public Tc01()
	{
	super();
	}
	@BeforeMethod
	public void beforemethod()
	{
	initialization();
	login = new Login();
	search=new Search();
	AccountPage=new Accountpage(); 
	}
	@Test
	public void testcase(){
		login.login_click();
	}
	@Test
	public void testcase2() throws InterruptedException, AWTException {
		login.login_click();
		Thread.sleep(2000);
		search.searchbtn();
	}
	@Test
	public void testcase3 () {
		SoftAssert softAssert = new SoftAssert();
		
		// login.login_click();
		AccountPage.scrollDownMethod();
		softAssert.assertAll();
	}
	@Test
	 public void verifyCookiesHandle(){
	     SoftAssert softAssert = new SoftAssert();
	     AccountPage.getCookiesHandle();
	     softAssert.assertAll();
	}
	
	@Test(enabled=false)
	public void mouseHovering() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert();
		//login.login_click();
		AccountPage.mouse_Hover();
		softAssert.assertAll();
	}
	
}

