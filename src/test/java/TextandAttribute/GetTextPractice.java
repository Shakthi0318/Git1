package TextandAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextPractice {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement s = driver.findElement(By.xpath("//input[@id='email_create']"));

	//	s.sendKeys("shakthi24@gmail.com");
		
	System.out.println(s.getAttribute("name"));
	System.out.println("text is:" +s.getText());
	
	WebElement w = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
	
	System.out.println(w.getAttribute("type"));
	System.out.println(w.getAttribute("name"));
	System.out.println("Text are:" +w.getText());
	
	}

}
