package Rahul_Shetty_TestNG_Practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	
//	@Test(dependsOnMethods ={"day3.bt"})
//	public void start() {
//		System.out.println("This call is from test method ");
//	}
//
//	@Test
//	public void bt() {
//		System.out.println("This call is from the before test execution method");
	
	@BeforeSuite()
	public void BS() {
		System.out.println("This call is from the before suite");
	}

	@AfterSuite()
	public void AS() {
		System.out.println("This call is from the after suite");
	}
}




