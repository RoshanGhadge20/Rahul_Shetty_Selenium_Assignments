package Rahul_Shetty_TestNG_Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void start() {
		System.out.println("This call is from test method ");
	}

	@BeforeTest()
	public void bt() {
		System.out.println("This call is from the before test execution method");

	}

	@AfterTest()
	public void at() {
		System.out.println("This call is from the After test method");
	}

}
