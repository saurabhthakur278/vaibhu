package vaibhu.vaibhu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class challlenge3 {


	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=\"frame-top\"]")));
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
	
	
}}
