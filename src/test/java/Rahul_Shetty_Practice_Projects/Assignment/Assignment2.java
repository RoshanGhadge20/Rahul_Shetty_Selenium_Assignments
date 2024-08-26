package Rahul_Shetty_Practice_Projects.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		// Working with Form elements
		driver.findElement(By.name("name")).sendKeys("Roshan Sanjay Ghadge");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("roshanghadge568@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Roshan@Demo#1234");
		driver.findElement(By.className("form-check-input")).click();
		WebElement element = driver.findElement(By.id("exampleFormControlSelect1"));
		Select se = new Select(element);
		se.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).sendKeys("11/20/2000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String msgSting = driver.findElement(By.className("alert-success")).getText();
		System.out.println(msgSting);
		
		driver.quit();
		
		System.out.println("End of Programs");
	}

}
