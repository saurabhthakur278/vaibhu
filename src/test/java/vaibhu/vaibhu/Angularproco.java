package vaibhu.vaibhu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Angularproco {
	static WebDriver driver;
	@Test(priority = 1)
	public void setup1() throws InterruptedException {
		String a="India";
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='name']:last-child")).sendKeys("saurabh");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("tsaurabh278@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name=\"bday\"]")).sendKeys("03/05/1993");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	    System.out.println(driver.findElement(By.cssSelector(".close")).getText());
	

}
}