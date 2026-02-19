package HandlingCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


// Specific
public class HandleCheckBox {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakthi\\OneDrive - PQube Business Solutions Pvt. Ltd\\Desktop\\PracticeOnAutomation\\Driver1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='monday']")).click();

	}

}
