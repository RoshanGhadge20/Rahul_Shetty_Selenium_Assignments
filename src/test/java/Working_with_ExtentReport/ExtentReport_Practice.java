package Working_with_ExtentReport;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_Practice {
	ExtentReports ex;
	
	@BeforeTest
	public void extentreportmethod()
	{
		
		String path=System.getProperty("User.dir")+"//reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Automation Practice");
		reporter.config().setReportName("Rahul Shetty Automation Content Practice");
		
		new ExtentReports();
		ex.attachReporter(reporter);
		ex.setSystemInfo("QA", "Roshan Ghadge");
		
	}
	
	
	
	@Test
	public void getdata()
	{
		ExtentTest test=ex.createTest("getdata test case");
		System.out.println("This called is from the get data method");
		ex.flush();
	}
	
}
