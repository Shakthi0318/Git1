package WindowHandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MW {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakthi\\Desktop\\PracticeOnAutomation\\Driver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mmcportal.pqube.in:20443/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Support')]")).click();
		
	Set<String> s =  driver.getWindowHandles();
	
	System.out.println(s);
	
	for(String WindowID:s) {
		
		String title = driver.switchTo().window(WindowID).getTitle();
		System.out.println(title);
	}
		
	}

}
