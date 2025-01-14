package com.saucelab.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.saucelab.utilities.ReadConfig;


public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfig readConfig = new ReadConfig();
	String url=readConfig.getBaseUrl();
	String browser=readConfig.getBrowser();
	
	
	@BeforeClass
	public void setUp(){
		
		switch(browser.toLowerCase()){
		
		case "chrome":

			driver= new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
			driver=null;
			break;
		}
		driver.manage().window().maximize();
		logger = LogManager.getLogger("FrameworkApril2024");
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
	
	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "./Screenshots/" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
	
}
