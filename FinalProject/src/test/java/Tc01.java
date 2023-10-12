

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.WebTestBase;
import testpages.Login;

public class Tc01 extends WebTestBase{
	Login login;
	public Tc01()
	{
	super();
	}
	@BeforeMethod
	public void beforemethod()
	{
	initialization();
	login = new Login();
	}
	@Test
	public void testcase(){
		login.login_click();
	}
	
}
