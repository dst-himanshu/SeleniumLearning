package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int tsize = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		System.out.println(tsize);
		
		int s=1;
		
		while(s<3) {
			for(int i=1;i<tsize;i++) {
				String naam = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[2]")).getText();
				String kaam = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[3]")).getText();
				
				System.out.println(naam+'\t'+kaam);
			}
			driver.findElement(By.xpath("//a[contains(text(),''")).click();
			s+=1;
		}	
	}

}
