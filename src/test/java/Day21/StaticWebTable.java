package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Total no of rows
		int totalrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		int totalCol = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
//		System.out.println(totalCol);
		
		//Read data from specific coloumn and row
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText();
		
//		System.out.println(bookname);
		
		
		//Printing the table
		for(int i=2;i<=totalrows;i++) {
			for(int j=1;j<=totalCol;j++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		
		//Finding specific thing
		for(int k=2;k<=totalrows;k++) {
			String st = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[2]")).getText();
			
			if(st.equals("Mukesh")) {
				String bk = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[1]")).getText();
				System.out.println(bk+"\t"+st);
			}
		}

	}

}
