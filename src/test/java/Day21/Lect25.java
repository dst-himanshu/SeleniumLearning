package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		Relative Xpath example by one attribute.
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello");
		
//		Relative Xpath example by two attributes.
//		driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Bye");
		
//		Absolute Xpath example
//		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/header[1]/div[2]/div[2]/form[1]/input[1]")).sendKeys("Good Night");
		
		
//		Xpath with inner text
//		driver.findElement(By.xpath("//*[text()='Electronics']")).click();
		
//		Xpath with contains()
		driver.findElement(By.xpath("//*[contains(@placeholder,'Sea')]")).sendKeys("Hello");
		
//		X
		
		
		
		
		
		
		
		
		
		

	}

}
