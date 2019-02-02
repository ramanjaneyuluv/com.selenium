package com.selenium;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataDrvenUtil {
	//static Xls_Reader reader;

	@Test
	public void getData() throws Exception{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		Dimension d=new Dimension(480,620);
		driver.manage().window().setSize(d);
		TakesScreenshot screenshotFile=((TakesScreenshot)driver);
		
		File destFile=screenshotFile.getScreenshotAs(OutputType.FILE);
		
		/*File image=new File(fileWithPath);
		org.apache.commons.io.FileUtils.copyFile(destFile, image);
		*///JavascriptExecutor js=(JavascriptExecutor)driver;
		
	}
	
	
}
