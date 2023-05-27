package MouseHoverActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DouleClick {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
     driver.get("https://www.google.com");
     Actions a= new Actions(driver);
     WebElement gmail= driver.findElement(By.xpath("(//a[@class='gb_q'])[1]"));
     Thread.sleep(3000);
     a.moveToElement(gmail).contextClick(gmail).perform();
	}
	
}