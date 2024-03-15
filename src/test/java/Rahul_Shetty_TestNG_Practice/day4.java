package Rahul_Shetty_TestNG_Practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups = ("Smoke"), timeOut = 5000)
	public void smoke1() {
		System.out.println("This is from the somke test1 with timeout of 5 seconds");
	}

	@Test(groups = ("Smoke"))
	public void smoke2() {
		System.out.println("This is from the somke test2");
	}

	@Test(groups=("Smoke"))
	public void smoke3()
	{
		System.out.println("This is from the somke test3");
		
		Assert.assertEquals(false, true);
	}

	@Test(groups = ("Smoke"))
	public void smoke4() {
		System.out.println("This is from the somke test4");
	}

	@Parameters("Name")
	@Test
	public void demo(@Optional String sample) {
		System.out.println("This is from the demo method to test the parameterization" + sample);
	}

}
