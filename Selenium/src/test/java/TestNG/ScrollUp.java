package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollUp {
	WebDriver driver;
	@BeforeTest
	public void browser() throws InterruptedException
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
	//Thread.sleep(4000);
	}
  @Test
  public void Scrollup() throws InterruptedException {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,1500)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,2000)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,2500)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,3000)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-500)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-1000)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-1500)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-2000)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,-2500)");

  }
}
