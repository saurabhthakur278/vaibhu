package vaibhu.vaibhu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fivedec {
	static WebDriver driver;
//@Test(priority = 1)
//public void setup() {
//	
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com/locatorspractice/");
//	driver.manage().window().maximize();
//	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("rahulshettyaadamy");
//	driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
//
//	
//}
//
//@Test(priority = 1)
//public void setup() {
//	
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	driver.manage().window().maximize();
//
//	WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//	Select dwop=new Select(dropdown);
//	
//	//dwop.selectByIndex(3);
//	dwop.selectByVisibleText("USD");
//	//selecty
//}
//}

//
@Test(priority = 1)
public void setup() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	
	driver.findElement(By.xpath("(//a[@value='GAU'][normalize-space()='Guwahati (GAU)'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	
}}

//	@Test(priority = 1)
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
//
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//		driver.findElement(By.xpath("(//a[@value='GAU'][normalize-space()='Guwahati (GAU)'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
//
//		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dwop = new Select(dropdown);
////	
////	//dwop.selectByIndex(3);
//		dwop.selectByVisibleText("USD");
////	
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]")).click();
//	}
//}

//ctl00_mainContent_view_date1

//
//
//
//@Test(priority = 1)
//public void setup() throws InterruptedException {
//	
//	WebDriverManager.chromedriver().setup();
//	driver=new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	driver.manage().window().maximize();
//	driver.findElement(By.id("checkBoxOption1")).click();
//  Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//	driver.findElement(By.id("checkBoxOption1")).click();
//	
//	
//	System.out.println( driver.findElements(By.xpath("//input[@type=\"checkbox\" ]")).size());
//}}
//
//
//
