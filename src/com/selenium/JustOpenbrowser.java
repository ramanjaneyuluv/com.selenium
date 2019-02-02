package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JustOpenbrowser {
	static WebDriver driver;
	@Test(invocationCount=2)
	@Parameters("browserName")
	public void browserName(String browser) {
	if(browser.equalsIgnoreCase("firefox"))
			{
		System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");	
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
		
		
			System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", "E:\\Browsers\\InternetExlporerFiles\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
			driver.get("http://www.google.com");
		     driver.quit();
	}
}
