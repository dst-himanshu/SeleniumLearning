package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void testlogin(String email,String pwd) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		if(status==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
		
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
		
	}
	
	@DataProvider(name="dp",indices= {1,3})
	Object[][] logindata(){
		
		Object data[][] = { {"abc@gmail.com","test123"},
							{"xyz@gmail.com","test012"},
							{"john@gmail.com","test@123"},
							{"Admin","admin123"},
							{"johncanedy@gmail.com","test"}
							};
		
		return data;
	}
}
	


