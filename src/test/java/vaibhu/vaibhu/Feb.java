package vaibhu.vaibhu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Feb {
	static WebDriver driver;
	@Test(priority = 1)
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String password=getPass(driver);
//		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("saurabh");
	
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("tsaurabh278@gmail.com");

		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9518332106");
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("form div button:last-child")).click();
//		System.out.println( driver.findElement(By.cssSelector("form p")).getText());
    	driver.findElement(By.cssSelector("form div button:first-child")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("tsaurabh278@gmail.com");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".signInBtn")).click();
//		System.out.println( driver.findElement(By.cssSelector(".login-container p")).getText());
//		System.out.println(s);
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".login-container p")).getText(), "You are successfully logged in.");
	}
	@Test
	public static String getPass(WebDriver driver) throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("form div button:last-child")).click();

		String pass= driver.findElement(By.cssSelector("form p")).getText();
		String arr[]=pass.split("'");
		String password=arr[1].split("'")[0];

		return password;

	}
	
}