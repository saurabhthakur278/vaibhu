package vaibhu.vaibhu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ash {
	static WebDriver driver;
	
	public static void main(String args[])
	{
//	System.out.println("Hello redbus");	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();

	driver.findElement(By.cssSelector("td[class='next'] button")).click();
	
	List<WebElement> ls=driver.findElements(By.cssSelector(".wd.day"));
//	int count=ls.size();
//	System.out.println(count);


	for (int i = 0; i < ls.size(); i++)
	{
		
		String svalue=driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
		
		if(svalue.equalsIgnoreCase("15"))
		{
			driver.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
			break;
		}
		
	}
	
	
	
	
//
//	while(! driver.findElement(By.cssSelector("tbody tr:nth-child(5) td:nth-child(4)")).getText().contains("Aug 2022"))
//	{
//		System.out.println("In While Loop");
//		
//		driver.findElement(By.cssSelector("[class='rb-calendar'] [class='next']")).click();
//		
//	}
//
//
//	List<WebElement> ls=driver.findElements(By.cssSelector("td[class='wd day']"));
//	int count=ls.size();
//	System.out.println(count);
//
//
//	for (int i = 0; i < count; i++)
//	{
//		System.out.println("In For Loop");
//		String svalue=driver.findElements(By.cssSelector("td[class='wd day']")).get(i).getText();
//		
//		if(svalue.equalsIgnoreCase("15"))
//		{
//			driver.findElements(By.cssSelector("td[class='wd day']")).get(i).click();
//		}
//		
//	}



}}
