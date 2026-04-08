package Day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect23Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wb = new ChromeDriver();
		
		wb.get("https://www.demoblaze.com/index.html");
		
		List <WebElement> linkL= wb.findElements(By.tagName("a"));
		
		System.out.println(linkL.size());
		
		List<WebElement> imgL = wb.findElements(By.tagName("img"));
		
		System.out.println(imgL.size());
		
		wb.findElement(By.linkText("Laptops")).click();
		
		
		
		
		

	}

}
