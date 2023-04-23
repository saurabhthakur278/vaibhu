package vaibhu.vaibhu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1bags {
	
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test(priority =2)
	public void login() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");;
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();;
		
	}
	
	@Test(priority =3)
	public void bagsunder15doller() {
		List <WebElement> l1 = driver.findElements(By.xpath("class=\"inventory_item_price\""));
		
		for(int i = 1;i>=l1.size()-1;i++) {
			l1.get(i);
			
			
		}
	}
	

}
