package com.Banking.screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Banking.framework.Reporter;
import com.Banking.webutilities.IP_webutilities;

public class Banking_Login extends IP_webutilities
{
	@FindBy(xpath = "//a[text()='here']")
	private static WebElement Where;
	
	@FindBy(name = "emailid")
	private static WebElement Wemailid;
	
	@FindBy(name = "btnLogin")
	private static WebElement WbtnLogin;
	
	
	@FindBy(name = "uid")
	private static WebElement username;

	@FindBy(name = "password")
	private static WebElement password;

	@FindBy(name = "btnLogin")
	private static WebElement Loginbtn;

	public void loginPage(String Eid,String Uname, String Password) throws InterruptedException 
	{
		

		boolean retVal;
		
		retVal = clickElement(Where);

		Reporter.log(retVal, "Clicked on here text link Succefully in Guru99 Bank Login page",
				"Failed to Click on here text link in Guru99 Bank Login page");
		Thread.sleep(MID_WAIT_TIME);
		
		retVal = Alert();

		Reporter.log(retVal, "Clicked on here text link Succefully in Guru99 Bank Login page",
				"Failed to Click on here text link in Guru99 Bank Login page");
		
		
		Thread.sleep(MID_WAIT_TIME);
		
		retVal = setEditValue(Wemailid, Eid);

		Reporter.log(retVal, "User Id entered Succefully in Guru99 Bank Login page",
				"Failed to Enter User Id  in Guru99 Bank Login page");
		Thread.sleep(MID_WAIT_TIME);
		
		retVal = clickElement(WbtnLogin);

		Reporter.log(retVal, "Clicked on here text link Succefully in Guru99 Bank Login page",
				"Failed to Click on here text link in Guru99 Bank Login page");

		retVal = setEditValue(username, Uname);

		Reporter.log(retVal, "User Id entered Succefully in Guru99 Bank Login page",
				"Failed to Enter User Id  in Guru99 Bank Login page");
		
		
		Thread.sleep(5000);

		retVal = setEditValue(password, Password);

		Reporter.log(retVal, "User Password entered Succefully in Guru99 Bank Login page",
				"Failed to Enter User Password  in Guru99 Bank Login page");
		
		Thread.sleep(MID_WAIT_TIME);
	//	Thread.sleep(5000);

		retVal = clickElement(Loginbtn);

		Reporter.log(retVal, "Clicked on Login Button Succefully in Guru99 Bank Login page",
				"Failed to Click on Login Button in Guru99 Bank Login page");
		
		
		Thread.sleep(5000);

	}

}
