package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lect31Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//Working with frame1
		WebElement fram1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(fram1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");
		driver.switchTo().defaultContent(); // used to get out of frame
		
		//Working with frame2
		WebElement fram2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(fram2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
		driver.switchTo().defaultContent();
		
		//and so-on we can go inside the frame and come outside....
		
		//Working with frame3 and iframe
		WebElement fram3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fram3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Testing");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i12']//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();
		driver.switchTo().defaultContent();
		
	}

}
