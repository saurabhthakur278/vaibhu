package vaibhu.vaibhu;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class greenwegi {
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String[] items={"Cucumber - 1 Kg","Cauliflower - 1 Kg","Beetroot - 1 Kg"};
		List<WebElement> vegilist=driver.findElements(By.cssSelector("h4.product-name"));
		List al = Arrays.asList(items);
		
		for(int i=0;i<=vegilist.size()-1;i++) {
			if(al.contains( vegilist.get(i).getText())) {
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
				
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".promoInfo"))));
		
		System.out.println( driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.cssSelector("button:last-child")).click();
		WebElement ele=driver.findElement(By.cssSelector("select"));
		
		Select s=new Select(ele);
		s.selectByValue("India");
		
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.cssSelector("button")).click();
		
		
		
//		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]")).click();
//		
//		driver.findElement(By.xpath("//button[.='PROCEED TO CHECKOUT']")).click();

}
}