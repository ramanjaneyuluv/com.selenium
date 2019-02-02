package com.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiWindows {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\Geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	    driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent window is:"+parentWindow);
		WebElement clickElement=driver.findElement(By.id("button1"));
	//	WebElement clickElement=driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		
		for(int i=0; i<3; i++){
			clickElement.click();
			Thread.sleep(3000);
			
		}
		Set<String> childWindows=driver.getWindowHandles();		
		for(String childs:childWindows){
			System.out.println("Child windows are:"+childs);
		}
	/*	driver.switchTo().defaultContent();
		driver.close();*/
	   String ParentwindowName= driver.switchTo().window("6442450945").getTitle();
	   System.out.println("parent window name is:"+ParentwindowName);
		driver.manage().window().maximize();
		driver.close();
		
		String childOne=driver.switchTo().window("6442450949").getTitle();
		System.out.println("child one name is:"+childOne);
		
		driver.manage().window().maximize();
		driver.close();
		
		String childTwo=driver.switchTo().window("6442450952").getTitle();
		System.out.println("child two name is:"+childTwo);
		
		driver.manage().window().maximize();
		driver.close();
		
		driver.switchTo().window("6442450955");
		driver.manage().window().maximize();
		driver.close();
		
		
	}

}
