package com.webtableHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableHandle {
	static WebDriver driver;
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("Row counts are:"+rowCount);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String befortxpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		for(int i=2;i<=7; i++){
			String actualXpathComapny=befortxpath+i+afterXpath;
			WebElement ele=driver.findElement(By.xpath(actualXpathComapny));
			System.out.println(ele.getText());
			if(ele.getText().equals("Island Trading")){
			System.out.println("Company name"+ele.getText()+"is found at postion:"+(i-1));
			break;
			}
		}
		
		System.out.println("**********");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		//*[@id="customers"]/tbody/tr[7]/td[2]
	
		String secondAfterXpath="]/td[2]";
		for(int i=2;i<=7;i++){
			String actualXpathContact=befortxpath+i+secondAfterXpath;
			WebElement secondEle=driver.findElement(By.xpath(actualXpathContact));
			System.out.println(secondEle.getText());
		}
		
		System.out.println("**********");
		String AfterXpathCountry="]/td[3]";
		for(int i=2;i<=7;i++){
			String actualXpathCountry=befortxpath+i+AfterXpathCountry;
			WebElement secondEle=driver.findElement(By.xpath(actualXpathCountry));
			System.out.println(secondEle.getText());
		}
		
	//Colomns counting
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		
		List<WebElement> colomns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int colCount=colomns.size();
		System.out.println("Total colomns count is: "+colCount);
}

}
