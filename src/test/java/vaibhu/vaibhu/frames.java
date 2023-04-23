package vaibhu.vaibhu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class$='demo-frame']")));
		
		WebElement a1=driver.findElement(By.cssSelector("#draggable"));
		
		WebElement a2=driver.findElement(By.cssSelector("#droppable"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(a1, a2).build().perform();
		
}
}