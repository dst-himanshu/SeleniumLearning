import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver drv = new ChromeDriver();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		drv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drv.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");
		drv.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		drv.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

}
