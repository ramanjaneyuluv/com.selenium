package com.webtableHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableClickingLink {

	static WebDriver driver;
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[contains(@href,'https://bit.ly/2zm3ZzF')]")).click();

	}

}
