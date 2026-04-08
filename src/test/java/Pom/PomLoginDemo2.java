package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginDemo2 {
	WebDriver driver;
	
	//Constructor
	PomLoginDemo2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locator
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username_loc;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password_loc;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_btn_loc;
	
	//Action on Locators
	public void set_username(String user) {
		username_loc.sendKeys(user);
	}
	public void set_password(String pass) {
		password_loc.sendKeys(pass);
	}
	public void login() {
		login_btn_loc.click();
	}
	

}
