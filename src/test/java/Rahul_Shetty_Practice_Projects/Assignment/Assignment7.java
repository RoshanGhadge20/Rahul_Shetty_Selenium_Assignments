package Rahul_Shetty_Practice_Projects.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Working with WebTables
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rowsElement = driver.findElements(By.cssSelector("table.table-display tbody tr")).size();
		System.out.println("Total Number of rows in the webtables:- " + rowsElement);

		int colElement = driver.findElements(By.cssSelector("table.table-display tbody tr th")).size();
		System.out.println("Total Number of columns in the webtables:- " + colElement);

		String dataElements = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[2]")).getText();
		System.out.println("data present in 2nd row is:- " + dataElements);

		driver.close();
		System.out.println("End of Program Execution");
	}

}
