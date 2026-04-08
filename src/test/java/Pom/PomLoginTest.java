package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PomLoginTest {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testlogin() {
		PomLoginDemo2 lg = new PomLoginDemo2(driver);
			lg.set_username("Admin");
			lg.set_password("admin123");
			lg.login();		
		
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
		
		
	}
	
	public static void main(String[] args)
	{
				
		PomLoginTest test = new PomLoginTest();
		test.setup();
		test.testlogin();
		
	}

}
