package PageObjectModel_PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTestCase {
	WebDriver driver;
	HompePage objHomePage;
	LoginPage objLoginPage;
	
	@BeforeTest
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

}
