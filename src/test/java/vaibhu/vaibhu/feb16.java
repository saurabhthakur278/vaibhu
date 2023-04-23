package vaibhu.vaibhu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class feb16 {
	static WebDriver driver;
//	@Test(priority = 1)
//	public void setup() throws InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//		System.out.println( driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
//		
//	}
	

	@Test(priority = 1)
	public void setup1() throws InterruptedException {
		String a="India";
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		
       List<WebElement> ss=driver.findElements(By.cssSelector("ul[id=\"ui-id-1\"] li a"));
      
       
       
       driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
//       for(int i=0;i<=ss.size()-1;i++) {
//    	   if(ss.get(i).getText().contains(a)) {
//    		   ss.get(i).click();
//    	   }
//       }
//       
       
       
       
//       for(WebElement asd:ss)
//       {
//    	   if(asd.getText().equalsIgnoreCase(a)) {
//    		   asd.click();
//    	   }
//       }
		
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		
//		driver.findElement(By.linkText("Adampur (AIP)")).click();
//		
//	driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
//	
//	driver.findElement(By.linkText("24")).click();
//		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
	}
		
		
//	driver.findElement(By.cssSelector("#divpaxinfo")).click();
//	driver.findElement(By.cssSelector("#hrefIncAdt")).click();
//	Thread.sleep(2000);
//	int i=1;
//	while(i<5) {
//	
//	driver.findElement(By.cssSelector("#hrefIncChd")).click();
//	i++;
//	}
//	
//	driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
//	
		
		
		
//		System.out.println( driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
//		WebElement el=driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
//		Select s1 = new Select(el);
//		s1.selectByIndex(2);
//		s1.selectByValue("USD");
//		s1.selectByVisibleText("USD");
	
	
	
	
	
	
	
	
	
}
