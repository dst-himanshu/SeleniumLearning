package FinalProject;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsedCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();// 1. Create an instance of ChromeOptions
		Map<String, Object> prefs = new HashMap<String, Object>();// 2. Create a map to store browser preferences
		prefs.put("profile.default_content_setting_values.notifications", 2);// 3. Set the preference to disable notifications (1 = Allow, 2 = Block)
		options.setExperimentalOption("prefs", prefs);// 4. Add the preferences to options

		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});//to hide the "Chrome is being controlled by automated test software" infobar
		 
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.zigwheels.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Clicking on More To open the Dropdown.
		driver.findElement(By.xpath("//span[normalize-space()='MORE']")).click();
		
		
		//Clicking on Used Cars from the dropdown.
		driver.findElement(By.linkText("Used Cars")).click();
		
		//Selecting the "Chennai" from the list of the cites..
		driver.findElement(By.xpath("//a[normalize-space()='Chennai']")).click();
		
		
		//Capturing elements of the popular cars in the below list.
		List<WebElement> popcarList = driver.findElements(By.xpath("//div[@class='gsc_thin_scroll']//label"));
		
		//Verifying the size of the list
		System.out.println(popcarList.size());
		
		
		//Printing the Cars Model names in the Console...
		for(WebElement s: popcarList) {
			String name = s.getText();
			//Printing the name
			System.out.println(name);
		}
		
		
		
	}

}
