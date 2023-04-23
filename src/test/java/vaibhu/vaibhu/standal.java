package vaibhu.vaibhu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standal {
	
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("userEmail")).sendKeys("tsaurabh278@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Qwerty@123");
		driver.findElement(By.id("login")).click();
		
	List<WebElement> products= driver.findElements(By.cssSelector(".mb-3"));
		
		
//		for(int i=0; i<=products.size();i++) {
//			
//			if(driver.findElement(By.cssSelector(".mb-3 b")).getText().equalsIgnoreCase("ZARA COAT 3")) {
//				driver.findElement(By.cssSelector(".card-body button:last-of-type")).click();	
//			}
//		}
//
//		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
//		
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
//		
//		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//nav/ul/li)[4]")));
		
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		
		
		  List<WebElement> addedlist=  driver.findElements(By.cssSelector(".cartSection h3"));
		
	
}
	
	
	


		
}