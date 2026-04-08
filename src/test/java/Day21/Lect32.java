package Day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lect32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdo = driver.findElement(By.xpath("//select[@id='country']"));
		Select drop = new Select(dropdo);
		drop.selectByVisibleText("India");
		drop.selectByValue("canada");
		drop.selectByIndex(0);
		List<WebElement> droplist = drop.getOptions();
		System.out.println(droplist.size());

	}

}
