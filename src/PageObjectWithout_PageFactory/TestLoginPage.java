package PageObjectWithout_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginPage {
	static WebDriver driver;
	
	@Test
	public void verifyValidLogin() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\ChromeFiles\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		LoginFreeCRMPage loginpage=new LoginFreeCRMPage(driver);
		/*loginpage.typePassword();
		loginpage.typePassword();
		loginpage.login_click();*/
		
		loginpage.loginCRM_reduceCode_Method("ramanja_va", "ramu@1234");
		Thread.sleep(5000);
		driver.quit();
		loginpage.loginCRM_reduceCode_Method("ram", "ramuu");
		
	}
}
