package DatePicker;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DatePicker{
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\BrowserDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
	}
	@Test
	public void date()
	{
		//DateFormat df= new SimpleDateFormat("DD/MM/YYYY");
		//Date systemdate= new Date();
		//String dateformat= df.format(systemdate); 
		//System.out.println(dateformat);
		driver.switchTo().frame(0);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeAsyncScript("document.getElementById('datepicker').value='31/07/1996'");
		
		
	}
}
