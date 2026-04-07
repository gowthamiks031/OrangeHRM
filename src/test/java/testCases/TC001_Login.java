package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_Login extends BaseClass{
	

	
	@Test
	public void logindetails()
	{
		HomePage hp=new HomePage(driver);
		hp.username("Admin");
		hp.pwd("Admin");
		hp.login();
		
	}

}
