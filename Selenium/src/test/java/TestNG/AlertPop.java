package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPop {
WebDriver driver;
Alert alert1;
	@BeforeTest
  public void Browser() throws InterruptedException {
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Thread.sleep(6000);
  }
@Test
public void m1() throws InterruptedException  {
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement checkavailability= driver.findElement(By.id("alertButton"));
	checkavailability.click();
	driver.switchTo().alert().accept();
		WebElement timealert= driver.findElement(By.id("timerAlertButton"));
		
		timealert.click();
		WebDriverWait wait= new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());

	//Thread.sleep(6000);
	driver.switchTo().alert().accept();
	WebElement alertyes_no= driver.findElement(By.id("confirmButton"));
	alertyes_no.click();
		driver.switchTo().alert().dismiss();
	WebElement promptalert= driver.findElement(By.id("promtButton"));
	promptalert.click();
	//WebDriverWait wait1= new WebDriverWait(driver,10);
	//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("promtButton")));
  Thread.sleep(3000);
	Alert prompt=driver.switchTo().alert();
	prompt.sendKeys("no");
	//Thread.sleep(2000);
	driver.switchTo().alert().accept();
}
	
/*	//Thread.sleep(4000);}
@Test
public void pop() {
	//Alert alert1 =driver.switchTo().alert();
	
	//System.out.println(alert1.getText());
		//alert1.accept();
		
		
		
	// OR METHOD 2
	//driver.switchTo().alert().accept();
	//Alert alert= driver.switchTo().alert();
	//alert().accept();
	//System.out.println(alert.getText());
	
	
}
  @AfterTest
  public void afterTest() {
	  //driver.close();
  }
*/
}
