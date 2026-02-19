package AutomationTestCases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		
		 WebDriver driver  = new ChromeDriver();
		 
		 driver.get("https://mmcportal.pqube.in:20443/");
		 driver.findElement(By.xpath("//ul[@class='top-menu notmobile' ]//span")).click();
		 Set<String> mul = driver.getWindowHandles();
		 
		 List<String> s = new ArrayList(mul);
          String parentID =s.get(0);
          String childID = s.get(1);
          
          driver.switchTo().window(parentID);
          System.out.println(driver.getTitle());
          
          driver.switchTo().window(childID);
          System.out.println(driver.getTitle());
		 
          driver.close();
		 
		 

	}

}
