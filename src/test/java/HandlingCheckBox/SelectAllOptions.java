package HandlingCheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shakthi\\OneDrive - PQube Business Solutions Pvt. Ltd\\Desktop\\PracticeOnAutomation\\Driver1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		
	List <WebElement>select =driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));

	System.out.println(select.size());

	for(WebElement a:select)
	{
		a.click();
	}
	
	
	}
	}


