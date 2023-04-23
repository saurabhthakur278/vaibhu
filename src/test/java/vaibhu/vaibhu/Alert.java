package vaibhu.vaibhu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	static WebDriver driver;

	@Test(priority = 1)
	public void setup1() throws InterruptedException {
		String a = "India";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
//	   driver.findElement(By.cssSelector("#alertbtn")).click();
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		driver.switchTo().alert().accept();

	}
}
