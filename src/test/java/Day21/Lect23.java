package Day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("https://demo.nopcommerce.com/");
		
//		WebElement sbox = drv.findElement(By.name("q"));
//		sbox.sendKeys("Hello");
		
//		drv.findElement(By.name("q")).sendKeys("Byee");
		
//		WebElement logo = drv.findElement(By.id("logo"));
//		boolean status = logo.isDisplayed();
//		
//		boolean status = drv.findElement(By.id("logo")).isDisplayed();
//		
//		System.out.println("Displayed status:"+ status );
		
//		----> LinkText and PartialLink
		
//		drv.findElement(By.linkText("Electronics")).click();
		
		List<WebElement> ele = drv.findElements(By.tagName("a"));
		System.out.println(ele.size());
		
		List<WebElement> timg = drv.findElements(By.tagName("img"));
		System.out.println(timg.size());
		
		drv.findElement(By.partialLinkText("Elect")).click();
		drv.findElement(By.partialLinkText("Others")).click();
		
		List<WebElement> elemts = drv.findElements(By.className("item-box"));
		System.out.println(elemts.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
