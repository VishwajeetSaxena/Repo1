package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLoader {
	//	WebDriver driver; 

	public ThreadLocal<WebDriver> getWebDriver(ThreadLocal<WebDriver> driver, String browser)
	{
		if("chrome".equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
			driver.set(new ChromeDriver());
		}else if ("firefox".equalsIgnoreCase(browser)){
			System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");
		}

		return driver;
	}

}
