package TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Horizonalscroll {
	WebDriver driver;
	@BeforeTest
	public void browserlaunch()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		driver.get("https://www.album.alexflueras.ro/index.php");
		driver.manage().window().maximize();
		
	}
  @Test
  public void horizonal() throws InterruptedException {
	  JavascriptExecutor js=  (JavascriptExecutor)driver;
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(5000, 0)");
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(-5000, 0)");
  }
}
