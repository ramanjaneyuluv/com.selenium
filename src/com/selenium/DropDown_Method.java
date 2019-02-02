package com.selenium;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Method {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String ele=driver.findElement(By.xpath("//*[@id='day']")).getText();
		System.out.println(ele);
		if(ele.equals("27")){
			
		}
		/*Select dropDown= new Select(ele);
		List<WebElement> value=dropDown.getOptions();
		for(WebElement item:value){
			System.out.println("All items are:"+item);
		}
	*/}

}
