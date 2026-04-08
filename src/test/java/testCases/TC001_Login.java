package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_Login extends BaseClass{
	

	
	@Test
	public void logindetails()
	{
		logger.info("***Starting TC001_Login ***");
		try {
		HomePage hp=new HomePage(driver);
		logger.info("Launched OrangeHRM Website successfully");
		hp.username("Admin");
		hp.pwd("admin1234");
		logger.info("Entered username and password");
		hp.login();
		String confmsg=hp.dashboardicon();
		//Assert.assertEquals(confmsg, "Dashboard");
		if(confmsg.equals("Dashboard"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed....");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		logger.info("Logged into OrangeHRM application successfully");
		
		}
		catch(Exception e) 
		{
			
			Assert.fail();
		}
		logger.info("***Finished TC001_Login ***");
		
	}

}
