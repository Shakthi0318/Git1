package TextandAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
	 driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	 WebElement s = driver.findElement(By.xpath("//input[@id='Email']"));
	// s.clear();
	// s.sendKeys("shakthi@pqube.in");
	 
	 System.out.println(s.getAttribute("value"));
	 
	 System.out.println("Results from getText:" +s.getText());
	 
	 WebElement a = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	 
	 System.out.println(a.getAttribute("type"));
	 System.out.println(a.getAttribute("class"));
	 
	 System.out.println(a.getText());
		

	}

}
