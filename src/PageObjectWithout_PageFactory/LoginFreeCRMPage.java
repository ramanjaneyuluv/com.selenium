package PageObjectWithout_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginFreeCRMPage {
	WebDriver driver;
	By userName=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//input[contains(@type,'submit')]");
	
	public LoginFreeCRMPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void typeUserName(){
		driver.findElement(userName).sendKeys("ramanja_va");
	}
	public void typePassword(){
		driver.findElement(password).sendKeys("ramu@1234");
	}
	public void login_click(){
	WebElement loginclick=driver.findElement(login);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginclick);
	}
	
	public void loginCRM_reduceCode_Method(String userid, String passwd){
		driver.findElement(userName).sendKeys(userid);	
		driver.findElement(password).sendKeys(passwd);
		WebElement loginclick=driver.findElement(login);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginclick);
		
	}

}
