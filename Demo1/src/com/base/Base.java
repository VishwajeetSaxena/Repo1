/**
 * 
 */
package com.base;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.CommonUtils;
import com.DriverLoader;
import com.LocalDriverManager;
import com.LogInit;
import com.page.Page;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * @author Vish
 *
 */
public class Base {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public static String propFile = "config/generalConfig.properties";
	protected CommonUtils utl; 
	protected LogInit logs; 
	protected ExtentReports extent;
	public Page page;
	public Logger log;
	private String currentSysTime;
	public DriverLoader ob;
	
	
	protected void setExtentReports()
	{	
		this.currentSysTime = (((utl.getCurrentSysDateTime()).replaceAll("/", "_")).replaceAll(":", "")).replaceAll(" ", "");
		
		this.logs.log.info(this.currentSysTime);
		extent = new ExtentReports(utl.readProperties(propFile,"extentResultsFolder")+"Result_"+this.currentSysTime+".html" );
		this.extent.loadConfig(new File(utl.readProperties(propFile,"extentConfigFile")));	
		this.extent.addSystemInfo("AUT", utl.readProperties(propFile,"AUT"));
		
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void startReport(String browser)
	{	
		utl = new CommonUtils();
		
		
		this.logs = new LogInit();
		this.logs.initLogs();
		this.logs.log.info("Start");
		
		
		setExtentReports();
		
		ob = new DriverLoader();
		Base.driver = ob.getWebDriver(driver, browser);
		
//		LocalDriverManager.setWebDriver(driver);
		WebDriver webDriver = Base.driver.get();
		page = new Page(webDriver);
	}
	
	
	@AfterTest(alwaysRun=true)
	public void afterSuite()
	{
		extent.flush();
		driver.get().quit();
	}

}
