package HandleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutUsingInbuilts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("input-country"));
		
		Select s = new Select(drop);

		 List <WebElement> alloptions= s.getOptions();
		 
		 for(WebElement x:alloptions)
		 {
			 if(x.getText().equals("India"))
			 {
				 x.click();
				 break;
			 }
		 }
		
		
	}

}
