package Rahul_Shetty_TestNG_Practice;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class day2 {
	
	@Test()
	public void start() {
		System.out.println("This call is from test  ");
	}

	@BeforeTest()
	public void bt() {
		System.out.println("This call is from the before test");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before every method");
	}
	
	@AfterTest()
	public void at() {
		System.out.println("This call is from the After test ");
	}
	
	@BeforeSuite()
	public void bs() {
		System.out.println("This call is from the Before suite ");
	}
	
//	@AfterSuite()
//	public void as()
//	{
//		System.out.println("This call is from the After Suite method");
//	}
	
	@BeforeClass
	public void bc() {
		System.out.println("This call is from the before class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("This call is from After class");
	}
	
}
