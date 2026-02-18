package WindowHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SW {

	public static void main(String[] args) {
	
			
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakthi\\OneDrive - PQube Business Solutions Pvt. Ltd\\Desktop\\PracticeOnAutomation\\driver\\chromedriver.exe");
	
	ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notification");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://mmcportal.pqube.in:20443/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Support')]")).click();
		
		Set<String> m = driver.getWindowHandles();
		
		List<String> a = new ArrayList(m);
		String parentID = a.get(0);
		String childID = a.get(1);
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	
	}
}
