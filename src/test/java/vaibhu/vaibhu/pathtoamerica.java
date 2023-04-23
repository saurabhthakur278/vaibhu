package vaibhu.vaibhu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pathtoamerica {
	
	
	static WebDriver driver;
	
	
//
//	@Test(priority = 1)
//	public void setup() throws InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.path2usa.com/travel-companions");
//		//driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//span[@class='pp-button-title']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
//
//}
//	
	//https://rahulshettyacademy.com/seleniumPractise/#/
	
		@Test(priority = 1)
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
	
	
	
	
	
	
		}
	
	
	
	
	
}
