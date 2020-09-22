package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfileTestCase {
	
	@Test
	public void updateProfile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suganya Jayakumar\\workspace\\ProjectObjectModel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");	
		PageFactory.initElements(driver, LoginPageObjects.class);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginButton.click();
		Thread.sleep(4000);
		UpdateProfileObjects.myProfile.click();
		Thread.sleep(4000);
		UpdateProfileObjects.phoneNumber.sendKeys("123456789");
		UpdateProfileObjects.city.sendKeys("Chennai");
		UpdateProfileObjects.submit.click();	
		
		//LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		//LoginPageObjects.password(driver).sendKeys("demouser");
		//LoginPageObjects.loginButton(driver).click();
		//Thread.sleep(4000);
		//UpdateProfileObjects.myProfile(driver).click();
		//Thread.sleep(4000);
		//UpdateProfileObjects.phoneNumber(driver).sendKeys("123456789");
		//UpdateProfileObjects.city(driver).sendKeys("Chennai");
		//UpdateProfileObjects.submit(driver).click();
		
		driver.quit();
	}
}
