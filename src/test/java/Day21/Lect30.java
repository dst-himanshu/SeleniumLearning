package Day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and @type='checkbox']"));
		
		for(WebElement x:checkBoxes) {
			x.click();
		}
		
		for(int i=0;i<checkBoxes.size();i++) {
			if(i%2==0) {
				checkBoxes.get(i).click();
				
			}
			
		}
		
		System.out.println(checkBoxes.size());
		
		
		
		
		
	}

}
