package TestngPrac;

import org.testng.annotations.Test;

public class Group1LoginTest {
	
	@Test(priority=1,groups= {"sanity"})
	void loginbyemail() {
		System.out.println("Logging in by email....");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginBygoogle() {
		System.out.println("Logging in by google");
	}

}
