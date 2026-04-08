package Day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method1: using sendkeys()
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2026");
		
		//Method2 using datepicker
		String year ="2025";
		String month = "May";
		String date ="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//Select month and year
		
		while(true) {
			String currmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currmonth.equals(month) && currYear.equals(year)) {
				break;
			}
			//for forward month year picking
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			//for backward month and year picking
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			
		}
		
		//Select the date.
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt: alldates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
	}

}
