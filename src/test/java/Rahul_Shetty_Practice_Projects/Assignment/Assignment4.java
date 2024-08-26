package Rahul_Shetty_Practice_Projects.Assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		// Initializing the setproperty & creating object of chromedriver
		System.setProperty("Webdriver.chrome.driver",
				"C://Users//Admin//Downloads//chromedriver-win64_ver117.01//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// assignment 4
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.example")));
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parentWindow = it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		driver.quit();
		System.out.println("End of Program");
	}

}
