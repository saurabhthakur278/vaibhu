package vaibhu.vaibhu;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class challange {

	
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		String[] items={"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		driver.findElement()
		
		
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#okayBtn")).click();
		WebElement ele=driver.findElement(By.cssSelector("select.form-control"));
	    Select s=new Select(ele);
	    s.selectByValue("consult");
	    
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		List al = Arrays.asList(items);
	    List<WebElement> ele1=driver.findElements(By.cssSelector(".card-title"));
		
	    for(int i=0;i<=ele1.size()-1;i++) {
			if(al.contains( ele1.get(i).getText())) {
				driver.findElements(By.cssSelector(".card-footer button")).get(i).click();
				
			}
		}
	    
	    driver.findElement(By.cssSelector(".nav-link.btn")).click();
//		driver.findElement(By.cssSelector("button.btn")).click();
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		driver.findElement(By.cssSelector("#country")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		
}
}