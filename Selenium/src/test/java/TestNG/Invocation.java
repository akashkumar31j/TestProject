package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocation {
  @Test
  public void f() {
	//WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver(); 
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  System.out.println("akash");
	 // driver.quit();
  }
}
