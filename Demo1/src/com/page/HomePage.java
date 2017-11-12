package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.pageactions.SelUtils;

public class HomePage {
	
	private SelUtils selUtils;
	private WebDriver driver;
	
	public HomePage(WebDriver webDriver) {
		this.driver = webDriver;
		this.selUtils = new SelUtils(driver);
		PageFactory.initElements(this.driver, this.getClass());
	}
	
	
	
	
	@FindBy(id="loginfrm")
	WebElement loginform;
	
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
