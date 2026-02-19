package AutomationTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriver {

	

	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakthi\\OneDrive - PQube Business Solutions Pvt. Ltd\\Desktop\\PracticeOnAutomation\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		Thread.sleep(3000);
		
		WebElement s1 = driver.findElement(By.id("name"));
		WebElement s2= driver.findElement(By.id("phone"));
		WebElement s3= driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		s1.sendKeys("Shakthi");
		s2.sendKeys("sh");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		s3.click();
		
	
		
		
		

	}

}
