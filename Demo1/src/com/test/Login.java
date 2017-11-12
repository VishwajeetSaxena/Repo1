package com.test;

import org.testng.annotations.Test;

import com.base.Base;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login extends Base {
	
	@Test
	private void login()
	{   ExtentTest loginTest = extent.startTest("Login to application");
		
		driver.get().get(utl.readProperties(propFile,"accurl"));
		logs.log.info("Page naviated");
		
		page.homePage.typeIn_UserName(utl.readProperties(propFile,"userName"));
		logs.log.info("User name entered");
		
		page.homePage.typeIn_Password(utl.readProperties(propFile,"password"));
		logs.log.info("Password entered");
		
		page.homePage.click_Submit();
		logs.log.info("Submit button clicked");
		
		
		
		loginTest.log(LogStatus.FAIL, "Failing for test");
		loginTest.log(LogStatus.PASS, "Passing for test");
	}
	
	

}
