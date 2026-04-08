package TestngPrac;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssert {
//	@Test
	void test_hardassertions() {
		System.out.println("testing....");
		System.out.println("testing....");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("testing....");
		System.out.println("testing.....");
	}
	
	@Test
	void softassertion() {
		System.out.println("TESTING...");
		System.out.println("TESTING...");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1,1);
		
		sa.assertAll();
		
	}

}
