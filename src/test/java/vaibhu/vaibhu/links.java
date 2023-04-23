package vaibhu.vaibhu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {
	
	WebDriver driver=null;

	@Test(priority = 1)
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	//@Test(priority = 2)
	public void pageLinks() {

		List<WebElement> list = driver.findElements(By.xpath("//ul//li//a"));
		int count = 0;
		for (int i = 0; i <= list.size() - 1; i++) {
			driver.findElements(By.xpath("//ul//li//a")).get(count).click();
			count++;
			driver.navigate().back();
			System.out.println(count);

		}

	}
	// @Test(priority = 3)
	public void dropdown()
	{
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 Select s=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		 s.selectByIndex(2);
		
		
		
	}
//	 @Test(priority = 4)
	 public void checkbox()
	 {
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		// int count=0;
		for(int i=1;i<=checkbox.size()-1;i++)
		{
			checkbox.get(i).click();
		}
		 
	 }
	// @Test(priority = 5)
	 public void table()
	 {
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> pp = driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody//tr//td[1]"));
		
		for(WebElement ppp:pp) {
			System.out.println("|  "+ ppp.getText()+"|  ");
		}
		 
		 
	 }
	 
	// public void 
	 
	 

}
