package Rahul_Shetty_Code_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_execution
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("Webdriver.chrome.driver", 
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		
		// working with chromeoptions to run test cases in headless mode
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Working with capturing the screenshots of the webelement & getting size of webelement
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namefield=driver.findElement(By.name("name"));
		namefield.sendKeys("Roshan Ghadge");
		File f=namefield.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("field.png"));
			
		//Working with how to get size & dimensions of webelement boxes 
		System.out.println(namefield.getRect().getDimension().getHeight());
		System.out.println(namefield.getRect().getDimension().getWidth());
		
		//To take screenshot of whole window/page
		File fobj=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fobj, new File("E://Rahul Shetty Course//Assignment//Screenshot//ss1.png"));
		
		//Closing all browsers window 
		driver.quit();
		System.out.println("End of program execution");
		
	}				
}
