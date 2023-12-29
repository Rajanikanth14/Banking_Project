package com.Banking.testcases;

import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Banking.framework.BaseTestClass;
import com.Banking.framework.Excel;
import com.Banking.screenpages.Banking_Login;


public class IP_testcases extends BaseTestClass
{
@Test
	
	public static  void TC_001_Bank_LoginTest() throws InterruptedException 
	{
			
		//Fetching data from TestData Sheet and calling function From ScreenPages
		
		String file_path= TESTDATA_PATH + TESTDATA_FILE;
		
		HashMap<String, String> data=Excel.getRowData2(file_path, "LoginPage", CURRENT_TESTCASE);
		
		
		com.Banking.screenpages.Banking_Login glogin=PageFactory.initElements(driver, Banking_Login.class);
		
		
		glogin.loginPage(data.get("Eid"),data.get("Uname"),data.get("Password"));
	}

}
