package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
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
  public void Scrolldown() throws InterruptedException {
	//WebElement MoreMovies=  driver.findElement(By.xpath("(//a[@class='morestory'])[6]"));
	WebElement rediffmail=  driver.findElement(By.xpath("//a[@class='mailicon']"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  Thread.sleep(4000);
	// js.executeScript("arguments[0].scrollIntoView();",MoreMovies);
	 //Thread.sleep(1000);
	 //js.executeScript("argument[0].click();",MoreMovies);
	 //Thread.sleep(9000);
	 js.executeAsyncScript("window.scrollBy(0,500)");//executeAsyncScript is faster than executeScript
	 //Thread.sleep(4000);
	 //js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
	 Thread.sleep(3000);
	 //js.executeScript("arguments[0].scrollIntoView();",rediffmail);
		 
  
  }
}
