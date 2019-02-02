package com.webtableHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandling {
	static WebDriver driver;
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("ramanja_va");
		driver.findElement(By.name("password")).sendKeys("ramu@1234");
		
		WebElement  loginBtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(@title,'Contacts')]")).click();
		
		//Type-1 clicking the check box in Dynamic web table
		
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
		
		String beforeXpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String afterXpath="]/td[2]/a";
	/*	for(int i=4;i<=7;i++){
			String name=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(name);
			if(name.contains("8588558")){
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
				
				//*[@id="vContactsForm"]/table/tbody/tr[5]/td[1]/input
			}
		}
		*/
		
		//Type-2 clicking the check box in Dynamic web table
		
		driver.findElement(By.xpath("//a[contains(text(),'8588558')]/parent::td//preceding-sibling::td/input[contains(@name,'contact_id')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'858856')]/parent::td//preceding-sibling::td/input[contains(@name,'contact_id')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'85885')]/parent::td//preceding-sibling::td/input[contains(@name,'contact_id')]")).click();
	}

}
