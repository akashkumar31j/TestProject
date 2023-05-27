package Synchronization;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Synchronization{
	WebDriver driver;
	@Test
	public void applaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		//driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	}
	@Test
	
	public void test1()
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userid=driver.findElement(By.id("email"));
           userid.sendKeys("123456789");
           WebElement password=driver.findElement(By.id("pass"));
   		password.sendKeys("123456789");
   		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		WebDriverWait wait= new WebDriverWait(driver,1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
   		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		//WebDriverWait wait1= new WebDriverWait(driver,1);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='submit'])[2]")));
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebElement continueyes=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//continueyes.click();
		//driver.close();
	}
}