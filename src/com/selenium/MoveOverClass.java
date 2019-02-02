package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveOverClass {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("ramanja_va");
		driver.findElement(By.name("password")).sendKeys("ramu@1234");

		WebElement loginButton=driver.findElement(By.xpath("//input[contains(@class,'btn btn-small')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);
		
		driver.switchTo().frame("mainpanel");
		WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		Actions build=new Actions(driver);
		build.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		

		
		

	}

}
