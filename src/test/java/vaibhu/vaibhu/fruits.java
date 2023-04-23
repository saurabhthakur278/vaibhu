package vaibhu.vaibhu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fruits 
{
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void food()
	{
		List<WebElement> vegname = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		 List<WebElement> vegprice = driver.findElements(By.xpath("//p[@class='product-price']"));
		 
		 List<WebElement> button = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		  
		 
		String [] arr= {"Brocolli - 1 Kg", "Cauliflower - 1 Kg", "Walnuts - 1/4 Kg"};
		 
		
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=vegname.size()-1;j++)
			{
	
		
				if(arr[i].equalsIgnoreCase(vegname.get(j).getText())) {
					button.get(i).click();
					
				}
			}
			
		}
		  
		/*
		 * for(WebElement v1:vegname) { System.out.println(v1.getText());
		 * 
		 * 
		 * } for(WebElement v2:vegprice) { System.out.println(v2.getText());
		 * 
		 * } for(WebElement b1:button) { b1.click(); }
		 * 
		 */		 
		 
	}
	@Test(priority = 3)
	public static void m1() 
	{
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"dropdownDiv\"]//ul//li"));
		
		
		
	}

}
