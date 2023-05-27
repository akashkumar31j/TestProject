package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ScreenShot {
	WebDriver driver;
  @BeforeTest
  public void applaunch() {
	  driver =new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
	  driver.get("https://www.cricbuzz.com");
	  driver.manage().window().maximize();
  }
  @Test
  public void screenshot() throws IOException
  {
	  TakesScreenshot ss= (TakesScreenshot)driver;
	  File file=ss.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file,new File("C:\\Users\\Admin\\Desktop\\ss\\cric.png"));
	 
  }
  
}
