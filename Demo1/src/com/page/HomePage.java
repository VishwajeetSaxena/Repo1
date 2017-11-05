package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageactions.SelUtils;

public class HomePage {
	
	private SelUtils selUtils = new SelUtils();
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='loginfrm']/div[1]/div[5]/button")
	WebElement submit;
	
	public HomePage typeIn_UserName(String uname)
	{
		selUtils.typeInEditBox(username, uname);
		
		return this;
	}
	
	
	public HomePage typeIn_Password(String pwd)
	{
		selUtils.typeInEditBox(password, pwd);
		
		return this;
	}
	
	public HomePage click_Submit()
	{
		selUtils.clickButton(submit);
		
		return this;
	}

}
