package Day21;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernDemo implements ITestListener{
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Runs when a test begin....");
	  }

	 
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
		  System.out.println("When a test passes...");
	  }

	 
	  public void onTestFailure(ITestResult result) {
	    // not implemented
		  System.out.println("When a test fails...");
	  }

	  
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
		  System.out.println("When a test skipped...");
	  }

	  public void onStart(ITestContext context) {
	    // not implemented
		  System.out.println("Run before test suite starts");
	  }

	 
	   
	  public void onFinish(ITestContext context) {
	    // not implemented
		  System.out.println("Run after test suite finishes...");
	  }
	
	

}
