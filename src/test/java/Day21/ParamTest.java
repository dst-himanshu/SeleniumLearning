package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"site"})
	void setup(String st) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(st);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testlogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		if(status == true) {
			System.out.println("Logo is present");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Logo is absent");
			Assert.fail();
		}
		
		
		
	}
		
	
	
	
	@Test(priority=2)
	void testTitle() {
		boolean stat = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M35.29 41.')]")).isDisplayed();
		if(stat == true) {
			System.out.println("G is presnt...");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("G is not present...");
			Assert.fail();
		}
		
	}
	
	
		
	

}
