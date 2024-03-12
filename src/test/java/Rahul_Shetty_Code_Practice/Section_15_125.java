package Rahul_Shetty_Code_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_15_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver",
				"E://Rahul Shetty Course//Assignment//WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		//How to work with multiple windows or tabs
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentwin=it.next();
		String childwin=it.next();
		
		driver.switchTo().window(childwin);
		driver.get("https://chromedriver.chromium.org/downloads");
		
		
		/*
		 * System.out.println(parentwin); System.out.println(childwin);
		 */
		
		driver.quit();
		System.out.println("End of Program execution");

	}

}
