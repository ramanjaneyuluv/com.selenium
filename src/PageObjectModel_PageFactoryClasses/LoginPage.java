package PageObjectModel_PageFactoryClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="username") WebElement userName;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[contains(@type,'submit')]") WebElement loginButton;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String strUsername){
		userName.sendKeys("ramanja_va");
	}
	public void setPassword(String strPassword){
		password.sendKeys("ramu@1234");
	}
	public void login_click(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);
	}

}
