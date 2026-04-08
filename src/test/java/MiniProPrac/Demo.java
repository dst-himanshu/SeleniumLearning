package MiniProPrac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Opening the dev.to
		driver.get("https://dev.to");
		
		//Selecting searchbox and searching testing
		WebElement ele =driver.findElement(By.id("search-input"));
		ele.sendKeys("Testing");
		ele.submit();
		
		
//		//h1[normalize-space()='Search results for testing']
//		String text = driver.findElement(By.xpath("//h1[normalize-space()='Search results for testing']")).getText();
//		System.out.println(text);
		
		//Checking if the page title contains testing text.
		String title = driver.getTitle();
		
		if(title.contains("Testing")) {
			System.out.println("Search Result Verified");
		}
		else {
			System.out.println("Search Failed");
		}
		
		
		//clicking on the First search result
		driver.findElement(By.id("article-link-3385279")).click();
		
		
		//Checking if the page contains Testing text in it.
		String pageText = driver.getPageSource();
		
		if(pageText.contains("Testing")) {
			System.out.println("Article Verified");
		}
		
		//clicking on Log in button
		driver.findElement(By.linkText("Log in")).click();
		
		//clicking on create account
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Sign up with Email']")).click();
		
		
		
	}

}
