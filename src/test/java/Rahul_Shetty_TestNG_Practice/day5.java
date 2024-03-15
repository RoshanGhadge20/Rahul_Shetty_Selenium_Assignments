// Working with the data provider in testng 

package Rahul_Shetty_TestNG_Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 {
	
	@DataProvider()
	/*
	 * // public Object[][] start() { ////
	 * System.out.println("This call is from test method "); //// return object[][]
	 * name{ //// {"data1","data2"} //// {"data3","data4"} //// } // }
	 */
	@Test
	public void bt() {
		System.out.println("Test");

	}

	@Test(dataProvider ="start")
	public void at(String name) {
		System.out.println("Test 1"+name);
	}

}
