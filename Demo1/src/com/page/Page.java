package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	public HomePage homePage;
	
	public Page(WebDriver driver)
	{
	    homePage = new HomePage(driver);
	}

}
