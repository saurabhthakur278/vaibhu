package vaibhu.vaibhu;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links1 {

	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> asd= driver.findElements(By.tagName("a"));
		System.out.println(asd.size());
	
	 WebElement footer=driver.findElement(By.cssSelector("#gf-BIG"));
	  System.out.println( footer.findElements(By.tagName("a")).size());
	
	  
	  
//	  if we want link of first col of footer
	  
	  
	  WebElement ele1= driver.findElement(By.cssSelector(".gf-t tbody tr td:first-child"));
//	  or you can wright footer.findEement(By.cssSelector(".gf-t tbody tr td:first-child"))
	  
	  
	    System.out.println( ele1.findElements(By.tagName("a")).size());
	  
//	    Click on each link  
	    
	    
	  for(int i=0;i<=ele1.findElements(By.tagName("a")).size()-1; i++) {
		  
		 String cickoninkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
		  ele1.findElements(By.tagName("a")).get(i).sendKeys(cickoninkTab);

		 

		  
	  }
	   Set<String> abc=  driver.getWindowHandles();
		   
Iterator<String> it= abc.iterator();

while(it.hasNext()){
driver.switchTo().window(it.next());

System.out.println(driver.getTitle());
	  
}
}
}