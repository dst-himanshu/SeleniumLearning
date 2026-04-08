package Day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		//Login
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//click on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

		//Opening options
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(5000);
		
		//Selecting the ceo option from job title
//		driver.findElement(By.xpath("//span[normalize-space()='Chief Executive Officer']")).click();
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//div[@role='listbox']//div"));
				//div[@role='option']
		
		for(WebElement x:optionsList) {
			System.out.println(x.getText());
		}
		
	}

}
