package Rahul_Shetty_Practice_Projects.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1
{

	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Working with checkboxes
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());

		// To get the total number of checkboxes
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		driver.quit();

	}

}
