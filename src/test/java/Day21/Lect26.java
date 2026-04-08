package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect26 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(500);
//		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
//		String windowId = driver.getWindowHandle();
//		System.out.println("Window ID:"+windowId);
		
		
//		driver.findElement(By.linkText("Instagram")).click();
//		
//		Set<String> windowids= driver.getWindowHandles();
//		
//		System.out.println(windowids);
		
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		boolean stat = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println(stat);
		
//		boolean sel = driver.findElement(By.xpath("//main[@id='main']//li[1]")).isSelected();
//		System.out.println(sel);
		
		WebElement vot= driver.findElement(By.xpath("//main[@id='main']//li[1]"));
		vot.click();
		System.out.println(vot.isSelected());
		
		
		
		
		
		
		
		
		

	}

}
