package Rahul_Shetty_Practice_Projects.Assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Initializing the setproperty & creating object of chromedriver
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// assignment 3
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
		// Thread.sleep(2000);
		// driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement drpElement = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select se = new Select(drpElement);
		se.selectByVisibleText("Consultant");
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
		List<WebElement> btns = driver.findElements(By.cssSelector("button.btn"));
		for (int i = 0; i < btns.size(); i++) 
		{
			btns.get(i).click();
		}
		driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/ul/li/a"));
		
		driver.close();
		System.out.println("End of Program Execution");
	}
}
