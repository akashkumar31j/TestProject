package WindowHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class WindowHandles 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\BrowserDrivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.axisbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement register= driver.findElement(By.xpath("(//div[@class='close_button'])[1]"));
		Thread.sleep(1000);
		register.click();
		Thread.sleep(5000);
		WebElement loginhover= driver.findElement(By.xpath("/html/body/header/div[4]/div[3]/div/div/div/div[2]/div[2]/a"));
		loginhover.click();
		Thread.sleep(4000);
		//Actions a= new Actions(driver);
		//a.moveToElement(loginhover);
		//Thread.sleep(2000);
		//WebElement loginclick= driver.findElement(By.className("hidden-xs"));
		//loginclick.click();
		Thread.sleep(5000);
		String WindowHandle=driver.getWindowHandle();
		driver.switchTo().window(WindowHandle);
		
	}
}