package AutomationTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakthi\\Desktop\\PracticeOnAutomation\\Driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://cms-test.greenheck.com/shop/");

		 String singleID = driver.getWindowHandle();
		 
		 System.out.println("The browser ID is:"+ singleID);
	}

}
