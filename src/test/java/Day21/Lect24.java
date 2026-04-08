package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wb = new ChromeDriver(); 
//		wb.get("https://demo.nopcommerce.com/");
		wb.get("https://www.quora.com/profile/Quora");
		
		wb.manage().window().maximize(); // Maximize the window
		
//		wb.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
//		wb.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		
//		wb.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
		
//		wb.findElement(By.cssSelector("input.search-box-text[placeholder=\"Search store\"]")).sendKeys("T-Shirts");
		

	}
}
