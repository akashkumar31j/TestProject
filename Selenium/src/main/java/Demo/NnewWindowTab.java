package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WindowType;
public class NnewWindowTab {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.cricbuzz.com");
	Thread.sleep(3000);
	//driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.rediff.com");
	
}
}