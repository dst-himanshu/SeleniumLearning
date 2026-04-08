package TestngPrac;

import org.testng.annotations.Test;

public class Group1SignupTest {
	
	@Test(priority=1,groups= {"regression"})
	void signupbyemail() {
		System.out.println("Signing up by email");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signupbygoogle() {
		System.out.println("Signing up by google");
	}

}
