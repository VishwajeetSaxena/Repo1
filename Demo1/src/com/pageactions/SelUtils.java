package com.pageactions;

import org.openqa.selenium.WebElement;

public class SelUtils {

	
	public void typeInEditBox(WebElement editField, String val) {
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
	
	
}
