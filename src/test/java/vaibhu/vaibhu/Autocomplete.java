package vaibhu.vaibhu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		List<WebElement> li=driver.findElements(By.cssSelector(".ui-menu-item"));
		
		for(int i=0; i<=li.size()-1;i++) {
			if(li.get(i).getText().equals("India")) {
				li.get(i).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(2000);
//		WebElement ele= driver.findElement(By.cssSelector(".ui-menu-item #ui-id-201"));
//		
//		Actions a=new Actions(driver);
//		a.moveToElement(ele).build().perform();
//	
//		
		
		

		
		
		
		
		
}
}