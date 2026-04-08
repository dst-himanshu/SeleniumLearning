package Day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		Driver.get("https://demo.nopcommerce.com/");
//		
//		Driver.navigate().to("https://demo.nopcommerce.com/");
//		
//		Driver.navigate().to("https://onecognizant.cognizant.com/Welcome");
//		
//		Driver.navigate().back();
//		
//		Driver.navigate().forward();
//		
//		Driver.navigate().refresh();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Instagram']")).click();
		Set<String> windowsIds = driver.getWindowHandles();
		
		System.out.println(windowsIds.size());
		
		List<String> windowList = new ArrayList(windowsIds);
		
		String parentID=windowList.get(0);
		String childID= windowList.get(1);
		
//		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		
		

	}

}
