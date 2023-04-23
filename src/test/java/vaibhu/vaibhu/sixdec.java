package vaibhu.vaibhu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sixdec 
{
	static WebDriver driver;
//	@Test(priority = 1)
//	public void setup() throws InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sss");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
//	}
//	
	
	
//
//	@Test(priority = 1)
//	public void setup() throws InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//		//driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sss");
//	//	WebElement asd=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
////		//id="ctl00_mainContent_DropDownListCurrency"
////	Select s= new Select(asd);
////	
////	s.selectByIndex(2);
////	s.get
//		
//		
//		
//		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value=\"AMD\"]")).click();
//		
//		
//		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//	
//		Thread.sleep(2000);
//				driver.findElement(By.xpath("(//a[@value='COK'][normalize-space()='Kochi (COK)'])[1]")).click();
		
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
//		
//		
//		for(int i=0;i<5;i++) {
//			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
//		}
//		
//	}
//	
	
	
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		
//	
//	//driver.findElement(By.xpath("By.xpa[@class='ui-state-default ui-state-hover']")).click();
//	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//td[@class=\" ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today\"]")).click();
//	
//	
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		List<WebElement> listof = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
		
		
	for( WebElement li:listof) {
		if(li.getText().equalsIgnoreCase("India")) {
			li.click();
			break;
		}
	}
		
	//@Test(priority = 1)
//	public void setup() throws InterruptedException {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.manage().window().maximize();
//
//		driver.findElement(By.id("autosuggest")).sendKeys("indi");
//		Thread.sleep(3000);
//
//		List<WebElement> options = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/a"));
//
//		for (WebElement option : options) {
//
//			if (option.getText().equalsIgnoreCase("india")) {
//				option.click();
//				break;
//			}
//		}
		
		
	}
	
	
	
	
}