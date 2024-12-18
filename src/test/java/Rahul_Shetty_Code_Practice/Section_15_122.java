package Rahul_Shetty_Code_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Section_15_122 {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Working with friendly locators WebElement
		WebElement namebox = driver.findElement(By.xpath("//input[@name=\"name\"][1]"));
		WebElement element = driver.findElement(RelativeLocator.with(By.tagName("label")).above(namebox));
		System.out.println(element.getText());

		driver.close();
		System.out.println("End of Program Execution");
	}

	private static By TagName(String string) {
		return null;
	}
}
