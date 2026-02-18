package AutomationTestCases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakthi\\Desktop\\PracticeOnAutomation\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mmcportal.pqube.in:20443/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//span")).click();
		
	Set<String>	s= driver.getWindowHandles();
	System.out.println(s);
	
	for(String WindowID:s)
	{
		String title = driver.switchTo().window(WindowID).getTitle();
		
	       System.out.println(title);
		
	}
		
		

	}

}
