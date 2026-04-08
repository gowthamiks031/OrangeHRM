package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

		
		//constructor
		public HomePage(WebDriver driver)
		{
			
			super(driver);
		}
		
        //Locators

@FindBy(xpath="//input[@placeholder='Username']") 
WebElement txt_username;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement txt_password;

@FindBy(xpath="//button[normalize-space()='Login']") 
WebElement btn_login;

@FindBy(xpath="//h6[normalize-space()='Dashboard']")
WebElement txt_dashboard;


//action methods

public void username(String username)

{
	txt_username.sendKeys(username);
	
}

public void pwd(String password)

{
	txt_password.sendKeys(password);
	
}
	
public void login()

{
	btn_login.click();
	
}

public String dashboardicon()
{
	try {
		
		return(txt_dashboard.getText());
	}catch(Exception e)
	{
		return(e.getMessage());
	}
}
	}


