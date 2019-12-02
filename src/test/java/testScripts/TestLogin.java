package testScripts;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin extends BaseTest {
	@Test
	public void demo()
	{
		LoginPage lg=new LoginPage(driver);
		lg.setEmail();
		lg.click();
		lg.setPassword();
		lg.click();
	
	 HomePage hp=new HomePage(driver);
	 hp.setname();
	 hp.setout();
	
	}
}
