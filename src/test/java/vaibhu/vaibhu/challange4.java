package vaibhu.vaibhu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class challange4 {
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		int sum=0;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");

Thread.sleep(2000);

js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000;");


       List<WebElement> li=  driver.findElements(By.cssSelector(".tableFixHead tr td:nth-child(4)"));
       
       
       for(int i=0;i<=li.size()-1;i++) {
    	   
    	  int a=Integer.parseInt(li.get(i).getText());
    	  
    	  sum=sum+a;
       }
System.out.println(sum);

     System.out.println("no of column present is "+driver.findElements(By.cssSelector(".table-display tr td:first-child")).size());

System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());

System.out.println("no of column present is "+driver.findElements(By.cssSelector(".table-display tbody th")).size());











}
	private int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}
}

//List<WebElement> li=	driver.findElements(By.cssSelector("input[type$='checkbox']"));
//
//for(int i=0;i<=li.size()-1;i++) {
//  if(li.get(i).getText().contains(name)) {
//	  li.get(i).click();
//  }
//}