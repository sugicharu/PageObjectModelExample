package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suganya Jayakumar\\workspace\\ProjectObjectModel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");	
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.username.click();
		
		//LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		//LoginPageObjects.password(driver).sendKeys("demouser");
		//LoginPageObjects.loginButton(driver).click();
		
		driver.quit();
	}
}
