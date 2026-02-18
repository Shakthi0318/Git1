package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPagetestCase {

	public static void main(String[] args) throws InterruptedException {
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakthi\\OneDrive - PQube Business Solutions Pvt. Ltd\\Desktop\\PracticeOnAutomation\\Driver\\chromedriver.exe");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakthi\\OneDrive - PQube Business Solutions Pvt. Ltd\\Desktop\\PracticeOnAutomation\\Driver1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
	driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
	WebElement s=	driver.findElement(By.name("Username"));
	s.sendKeys("Admin");
		driver.findElement(By.name("Password")).sendKeys("Admin123");
		
		driver.findElement(By.name("login")).click();

	}

}
