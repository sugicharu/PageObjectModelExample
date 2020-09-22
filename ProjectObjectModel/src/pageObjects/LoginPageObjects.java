package pageObjects;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how = How.NAME, using = "username")
	public static WebElement username;
	
	@FindBy(xpath = "//*[@id=\'loginfrm\']/div[3]/div[2]/label/input")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/section/div/div[1]/div[2]/form/button")
	public static WebElement loginButton;
	
	//public static WebElement username(WebDriver driver) {
	//	return driver.findElement(By.name("username"));
	//}
	//public static WebElement password(WebDriver driver) {
	//	return driver.findElement(By.xpath("//*[@id=\'loginfrm\']/div[3]/div[2]/label/input"));
	//}
	//public static WebElement loginButton(WebDriver driver) {
	//	return driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/div[2]/form/button"));
	//}
}
