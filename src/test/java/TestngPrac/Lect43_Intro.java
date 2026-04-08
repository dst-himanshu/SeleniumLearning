package TestngPrac;

import org.testng.annotations.Test;

//Open App
//Login
//Logout

public class Lect43_Intro {
	
	@Test(priority=1)
	void openapp() {
		System.out.println("Opening appplications");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("Login to applications");
	}
	
	@Test()
	void logout() {
		System.out.println("Logout from application");
	}
}
