package vaibhu.vaibhu;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class feb26 {

	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
	
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/cell-phones");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String[] items={"HTC One M8 Android L 5.0 Lollipop","HTC One Mini Blue","Nokia Lumia 1020"};
		
		List al = Arrays.asList(items);
		
	List<WebElement> li= driver.findElements(By.cssSelector(".product-title"));
	
	for(int i=0;i<=li.size()-1;i++) {
		if(al.contains(li.get(i).getText())) {
			driver.findElements(By.cssSelector(".button")).get(i).click();
			
		}
		}
		
	
}}
