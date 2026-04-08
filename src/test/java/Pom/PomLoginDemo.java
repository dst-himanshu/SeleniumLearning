package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomLoginDemo {
	
	WebDriver driver;
	
	//Login Page Constructor
	PomLoginDemo(WebDriver driver){
		this.driver = driver;
		
	}
	//Locators
	By username_loc= By.xpath("//input[@placeholder='Username']");
	By password_loc = By.xpath("//input[@placeholder='Password']");
	By login_btn_loc = By.xpath("//button[normalize-space()='Login']");
	
	//Actions
	public void set_username(String user) {
		driver.findElement(username_loc).sendKeys(user);		
	}
	public void set_password(String pass) {
		driver.findElement(password_loc).sendKeys(pass);
		
	}
	public void login() {
		driver.findElement(login_btn_loc).click();
	}
	

	

}
