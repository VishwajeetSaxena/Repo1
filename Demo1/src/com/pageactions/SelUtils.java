package com.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;

import com.base.Base;

public class SelUtils {

	private Logger log;
	private WebDriver driver;

	public SelUtils(WebDriver webDriver) {
		this.log = Logger.getLogger(this.getClass());
		this.driver = webDriver;
	}

	public void typeInEditBox(WebElement editField, String val) {
		try{
			editField.click();
			editField.clear();
			editField.sendKeys(val);
			log.info("clicked on object - "+editField+"; on page - "+driver.getCurrentUrl());
		}
		catch(Exception e)
		{
			log.debug("Exception occured while entering data on webelement - "+editField+"; on page - "+driver.getCurrentUrl());
			e.printStackTrace();
		}
	}

	public void typeInEditBox_WithoutClearing(WebElement editField, String val) {
		try{
			editField.click();
			editField.clear();
			editField.sendKeys(val);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public void clickButton(WebElement submitButton) {
		try{
			submitButton.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}


	public Boolean checkForm(WebElement elmnt) 
	{
		Boolean visibleSataus=false;
		try{
			visibleSataus = elmnt.isDisplayed();

			if(visibleSataus)
			{

			}
		}
		catch(Exception e)
		{

			e.printStackTrace();

		}
		return visibleSataus;
	}

}
