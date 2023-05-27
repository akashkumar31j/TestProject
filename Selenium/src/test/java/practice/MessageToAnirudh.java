package practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class MessageToAnirudh {
	public static void main(String[] args) throws InterruptedException  {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver();
driver.get("https://www.afreesms.com/intl/india");
driver.manage().window().maximize();
//Alert alert =driver.switchTo().alert();
//alert.dismiss();
driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
WebElement msg =driver.findElement(By.xpath("(//input[@type='text'])[1]"));

msg.sendKeys("9000688941");
WebElement ani_nubmer =driver.findElement(By.xpath("(//input[@type='text'])[1]/following::textarea"));

ani_nubmer.sendKeys("kaha par hai re laudoo ");
Thread.sleep(5000);
WebElement send =driver.findElement(By.id("submit"));
send.submit();
	}

	private static void ChromeOptions() {
		// TODO Auto-generated method stub
		
	}
}
