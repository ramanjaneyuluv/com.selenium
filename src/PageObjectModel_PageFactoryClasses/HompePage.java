package PageObjectModel_PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HompePage {
	WebDriver driver;
	@FindBy(xpath="") WebElement userName;
	
	public HompePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getHomePageDashBoardUserName(){
		return "";
	}
}
