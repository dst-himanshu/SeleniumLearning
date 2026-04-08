package TestngPrac;

import org.testng.annotations.Test;

public class Group1Payment {
	
	@Test(priority=1,groups= {"sanity","regression","mix"})
	void paymentbycard() {
		System.out.println("Paying by card");
	}
	
	@Test(priority=2,groups= {"sanity","regression","mix"})
	void paymentbycash() {
		System.out.println("Paying by the cash");
	}

}
