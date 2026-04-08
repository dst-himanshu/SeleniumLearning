package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		String n1 = driver.getTitle();
		
		if(n1.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Title matches");
		}
		else {
			System.out.println("Not Matches");
		}
				
		driver.close();

	}

}
