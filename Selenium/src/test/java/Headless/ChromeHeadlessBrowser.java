package Headless;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class ChromeHeadlessBrowser {
	WebDriver driver;
	
@BeforeTest
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
	ChromeOptions co= new ChromeOptions();
	co.addArguments("incognito");
	 driver= new ChromeDriver(co);
	  driver.get("https://www.cricinfo.com");
driver.manage().window().maximize();
}
	@Test
	public void text()
	{
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement RRvsCsk= driver.findElement(By.xpath("(//div[@class='ds-w-[288px] card scorecard'])[2]"));
		System.out.println(RRvsCsk.getText());
	}



}
