package TestngPrac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods = {"openapp","login"})
	void search() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=4)
	void advSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void logout() {
		Assert.assertTrue(true);
	}
	

}
